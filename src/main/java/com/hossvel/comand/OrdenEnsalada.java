package com.hossvel.comand;

import com.hossvel.model.Cocina;

public class OrdenEnsalada implements IOrdenComand {
    private Cocina cocina;

    public OrdenEnsalada(Cocina cocina) {
        this.cocina = cocina;
    }
    public void ejecutar() {
        cocina.prepararEnsalada();
    }
}