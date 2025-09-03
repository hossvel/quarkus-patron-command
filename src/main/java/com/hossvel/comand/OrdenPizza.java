package com.hossvel.comand;

import com.hossvel.model.Cocina;
import jakarta.enterprise.context.ApplicationScoped;


public class OrdenPizza implements IOrdenComand {

    private Cocina cocina;
    public OrdenPizza(Cocina cocina) {
        this.cocina = cocina;
    }
    public void ejecutar() {
        cocina.prepararPizza();
    }
}