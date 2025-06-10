package com.techlab.servicios;

import com.techlab.pedidos.*;
import com.techlab.productos.Producto;
import com.techlab.excepciones.StockInsuficienteException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedidoService {
    private List<Pedido> pedidos = new ArrayList<>();
    private ProductoService productoService;
    private Scanner scanner;

    public PedidoService(ProductoService productoService, Scanner scanner) {
        this.productoService = productoService;
        this.scanner = scanner;
    }

    public void crearPedido() {
        Pedido pedido = new Pedido();

        while (true) {
            System.out.print("Ingrese el ID del producto que desea agregar al pedido (o 0 para finalizar): ");
            int id = scanner.nextInt();
            if (id == 0) break;

            Producto p = productoService.buscarProductoPorId(id);
            if (p == null) {
                System.out.println("Producto no encontrado.");
                continue;
            }

            System.out.print("Ingrese la cantidad deseada: ");
            int cantidad = scanner.nextInt();

            try {
                if (cantidad <= 0 || cantidad > p.getStock())
                    throw new StockInsuficienteException("Cantidad inválida o insuficiente stock.");

                pedido.agregarLinea(new LineaPedido(p, cantidad));
                p.setStock(p.getStock() - cantidad);
                System.out.println("Producto agregado al pedido.");

            } catch (StockInsuficienteException e) {
                System.out.println(e.getMessage());
            }
        }

        if (!pedido.getLineasPedido().isEmpty()) {
            pedidos.add(pedido);
            System.out.println("Pedido creado exitosamente:");
            System.out.println(pedido);
        } else {
            System.out.println("Pedido vacío. No se guardó.");
        }
    }

    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados.");
            return;
        }

        pedidos.forEach(System.out::println);
    }
}

