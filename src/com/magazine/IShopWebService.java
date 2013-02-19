package com.magazine;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface IShopWebService {
	
	Shop getShop(Long id);
	
	Product getProduct(Long id);
	
	Order getOrder(Long id);
	
	void registerOrderOneWay(List<Product> products, String comment);
	
	List<Order> getAllOrders();
	
	Order registerOrder(List<Product> products, String comment);
}
