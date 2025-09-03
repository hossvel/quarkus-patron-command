package com.hossvel.service;

import com.hossvel.model.Cocina;
import com.hossvel.model.OrdenDTO;
import jakarta.ws.rs.core.Response;

public interface IServiceOrden {

    public Cocina ordenarPizza(OrdenDTO ordenDTO);

    public Cocina ordenarEnsalada(OrdenDTO ordenDTO);
}
