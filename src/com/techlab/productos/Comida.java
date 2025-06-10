package com.techlab.productos;

import java.time.LocalDate;

public class Comida extends Producto {
    private LocalDate fechaVencimiento;

    public Comida(int id, String nombre, double precio, int stock, LocalDate fechaVencimiento) {
        super(id, nombre, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return super.toString() + ", vencimiento=" + fechaVencimiento;
    }
}