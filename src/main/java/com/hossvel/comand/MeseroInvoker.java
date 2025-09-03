package com.hossvel.comand;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class MeseroInvoker {
    private List<IOrdenComand> ordenes = new ArrayList<>();
    public void tomarOrden(IOrdenComand orden) {
        ordenes.add(orden);
    }
    public void enviarOrdenes() {
        for (IOrdenComand orden : ordenes) {
            orden.ejecutar();
        }
        ordenes.clear();
    }
}
