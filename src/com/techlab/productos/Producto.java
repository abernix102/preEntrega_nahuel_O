package com.techlab.productos;

public class Producto {
    protected int id;
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "Producto{id=" + id + ", nombre='" + nombre + '\'' + ", precio=" + precio + ", stock=" + stock + '}';
    }
}