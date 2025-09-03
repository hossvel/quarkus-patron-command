package com.hossvel.service;

import com.hossvel.comand.IOrdenComand;
import com.hossvel.comand.MeseroInvoker;
import com.hossvel.comand.OrdenEnsalada;
import com.hossvel.comand.OrdenPizza;
import com.hossvel.factory.OrderFactory;
import com.hossvel.model.Cocina;
import com.hossvel.model.OrdenDTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ServiceOrden implements IServiceOrden{

    @Inject
    MeseroInvoker meseroInvoker;

    @Inject
    OrderFactory orderFactory;

    @Override
    public Cocina ordenarPizza(OrdenDTO ordenDTO) {

        Cocina cocina = new Cocina(ordenDTO.cliente,ordenDTO.cantidad,false);

        //agrega la orden
        meseroInvoker.tomarOrden(orderFactory.create(cocina, ordenDTO.tipo));
        // ejecuta las ordenes
        meseroInvoker.enviarOrdenes();

        cocina.setConfirmado(true);
        return cocina;
    }

    @Override
    public Cocina ordenarEnsalada(OrdenDTO ordenDTO) {
        Cocina cocina = new Cocina(ordenDTO.cliente,ordenDTO.cantidad,false);
        IOrdenComand iOrdenComand = new OrdenEnsalada(cocina);

        //agrega la orden
        meseroInvoker.tomarOrden(iOrdenComand);
        // ejecuta las ordenes
        meseroInvoker.enviarOrdenes();

        cocina.setConfirmado(true);
        return cocina;
    }
}
