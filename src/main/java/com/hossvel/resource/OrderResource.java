package com.hossvel.resource;

import com.hossvel.model.Cocina;
import com.hossvel.model.OrdenDTO;
import com.hossvel.service.IServiceOrden;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.Set;


@Path("/orden")

public class OrderResource {

    @Inject
    IServiceOrden iServiceOrden;

    @POST
    public Response ordenar(OrdenDTO ordenDTO) {

        return Response.status(Response.Status.CREATED).entity(iServiceOrden.ordenarPizza(ordenDTO)).build();
    }



}
