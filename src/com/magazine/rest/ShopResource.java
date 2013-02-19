package com.magazine.rest;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import com.magazine.Shop;

@Path("rest/shops")
public class ShopResource {
	
	@Context
	UriInfo info;
	
	@GET
	public List<Shop> getShops() {
		return null;
	}
	
	@GET
	@Path("{id}")
	public Shop getOrder(@PathParam("id") Long id) {
		return null;
	}

}
