package com.techlab.pedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contadorId = 1;
    private int id;
    private List<LineaPedido> lineasPedido = new ArrayList<>();

    public Pedido() {
        this.id = contadorId++;
    }

    public void agregarLinea(LineaPedido linea) {
        lineasPedido.add(linea);
    }

    public List<LineaPedido> getLineasPedido() {
        return lineasPedido;
    }

    public double calcularTotal() {
        return lineasPedido.stream().mapToDouble(l -> l.getProducto().getPrecio() * l.getCantidad()).sum();
    }

    @Override
    public String toString() {
        return "Pedido ID: " + id + " | Total: $" + calcularTotal() + " | Detalles: " + lineasPedido;
    }
}
