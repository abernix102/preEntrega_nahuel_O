package com.techlab.app;

import com.techlab.servicios.ProductoService;
import com.techlab.servicios.PedidoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductoService productoService = new ProductoService(scanner);
        PedidoService pedidoService = new PedidoService(productoService, scanner);

        while (true) {
            System.out.println("\n=================================== SISTEMA DE GESTIÓN - TECHLAB ==================================");
            System.out.println("1) Agregar producto");
            System.out.println("2) Listar productos");
            System.out.println("3) Buscar/Actualizar producto");
            System.out.println("4) Eliminar producto");
            System.out.println("5) Crear un pedido");
            System.out.println("6) Listar pedidos");
            System.out.println("7) Salir\n");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> productoService.agregarProducto();
                case 2 -> productoService.listarProductos();
                case 3 -> productoService.buscarYActualizarProducto();
                case 4 -> productoService.eliminarProducto();
                case 5 -> pedidoService.crearPedido();
                case 6 -> pedidoService.listarPedidos();
                case 7 -> {
                    System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                    return;
                }
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}