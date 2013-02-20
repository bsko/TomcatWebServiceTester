package com.magazine.rest;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.ws.WebServiceProvider;

import com.magazine.Product;
import com.magazine.Shop;

@WebServiceProvider
@Path("rest/products")
public class ProductResource extends Resource {
	
	@Context
	UriInfo info;
	
	@GET
	@Path("{id}")
	public Product getProduct(@PathParam("id") Long id) {
		return storage.getProduct(id);
	}
	
	@POST
	public List<Product> getProducts(Shop shop) {
		return storage.getProducts(shop);
	}
	
}
