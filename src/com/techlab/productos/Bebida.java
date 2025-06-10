package com.techlab.productos;

public class Bebida extends Producto {
    private double litros;

    public Bebida(int id, String nombre, double precio, int stock, double litros) {
        super(id, nombre, precio, stock);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return super.toString() + ", litros=" + litros;
    }
}
