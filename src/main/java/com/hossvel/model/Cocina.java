package com.hossvel.model;

public class Cocina {
    private String cliente;
    private int cantidad;
    private boolean confirmado;

    public Cocina() {
    }

    public Cocina(String cliente, int cantidad, boolean confirmado) {
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.confirmado = confirmado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    public void prepararPizza() {
        System.out.println("Preparando "+ cantidad  + " pizzas para el Cliente: " + cliente);
    }
    public void prepararEnsalada() {
        System.out.println("Preparando "+ cantidad  + " ensaladas para el Cliente: " + cliente);
    }
}
