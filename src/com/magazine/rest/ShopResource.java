package com.magazine.rest;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import com.magazine.Shop;

@Path("rest/shops")
public class ShopResource extends Resource {
	
	@Context
	UriInfo info;
	
	@GET
	@Path("{id}")
	public Shop getShop(@PathParam("id") Long id) {
		return storage.getShop(id);
	}

}
