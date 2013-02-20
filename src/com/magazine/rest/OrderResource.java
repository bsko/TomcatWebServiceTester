package com.magazine.rest;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.ws.WebServiceProvider;

import com.magazine.Order;
import com.magazine.Product;

@WebServiceProvider
@Path("rest/orders")
public class OrderResource extends Resource {
	
	@Context
	UriInfo info;
	
	@GET
	public List<Order> getOrders() {
		return storage.getAllOrders();
	}
	
	@GET
	@Path("{id}")
	public Order getOrder(@PathParam("id") Long id) {
		return storage.getOrder(id);
	}
	
	@POST
	public Order registerOrder(List<Product> products, String comment) {
		return storage.registerOrder(comment, products);
	}
	
	@PUT
	public void registerOrderOneWay(List<Product> products, String comment) {
		storage.registerOrder(comment, products);
	}
}
