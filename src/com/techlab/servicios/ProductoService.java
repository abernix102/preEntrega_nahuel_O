package com.techlab.servicios;

import com.techlab.productos.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductoService {
    private List<Producto> productos = new ArrayList<>();
    private Scanner scanner;
    private int idCounter = 1;

    public ProductoService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad en stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        productos.add(new Producto(idCounter++, nombre, precio, stock));
        System.out.println("Producto agregado correctamente.");
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            productos.forEach(System.out::println);
        }
    }

    public Producto buscarProductoPorId(int id) {
        return productos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void buscarYActualizarProducto() {
        System.out.print("Ingrese el ID del producto a buscar: ");
        int id = scanner.nextInt();
        Producto p = buscarProductoPorId(id);

        if (p != null) {
            System.out.println("Producto encontrado: " + p);
            System.out.print("Nuevo precio (actual: " + p.getPrecio() + "): ");
            double precio = scanner.nextDouble();
            System.out.print("Nuevo stock (actual: " + p.getStock() + "): ");
            int stock = scanner.nextInt();
            scanner.nextLine();

            p.setPrecio(precio);
            p.setStock(stock);
            System.out.println("Producto actualizado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProducto() {
        System.out.print("Ingrese el ID del producto a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}