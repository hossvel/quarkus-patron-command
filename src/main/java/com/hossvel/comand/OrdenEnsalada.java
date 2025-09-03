package com.hossvel.comand;

import com.hossvel.model.Cocina;
import jakarta.enterprise.context.ApplicationScoped;


public class OrdenEnsalada implements IOrdenComand {
    private Cocina cocina;

    public OrdenEnsalada(Cocina cocina) {
        this.cocina = cocina;
    }
    public void ejecutar() {
        cocina.prepararEnsalada();
    }
}