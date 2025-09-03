package com.hossvel.comand;

import com.hossvel.model.Cocina;

// ConcreteCommand
public class OrdenPizza implements IOrdenComand {

    private Cocina cocina;
    public OrdenPizza(Cocina cocina) {
        this.cocina = cocina;
    }
    public void ejecutar() {
        cocina.prepararPizza();
    }
}