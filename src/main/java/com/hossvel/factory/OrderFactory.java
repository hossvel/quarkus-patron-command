package com.hossvel.factory;

import com.hossvel.comand.IOrdenComand;
import com.hossvel.comand.OrdenEnsalada;
import com.hossvel.comand.OrdenPizza;
import com.hossvel.model.Cocina;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class OrderFactory {

    public IOrdenComand create(Cocina cocina, String tipo) {
        return switch (tipo.toLowerCase()) {
            case "pizza" -> new OrdenPizza(cocina);
            case "ensalada" -> new OrdenEnsalada(cocina);
            default -> throw new IllegalArgumentException("Tipo de pedido no soportado: " + tipo);
        };
    }

}
