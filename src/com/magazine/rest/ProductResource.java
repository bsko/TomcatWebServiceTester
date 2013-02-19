package com.magazine.rest;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import com.magazine.Product;
import com.magazine.Shop;

@Path("rest/products")
public class ProductResource extends Resource {
	
	@Context
	UriInfo info;
	
	@GET
	public List<Product> getProducts() {
		return null;
	}
	
	@GET
	@Path("{id}")
	public Product getProduct(@PathParam("id") Long id) {
		return null;
	}
	
	@POST
	public List<Product> getProducts(Shop shop) {
		return storage.getProducts(shop);
	}
	
}
