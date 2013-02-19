package com.magazine;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface IShopWebService {
	
	Shop getShop(Long id);
	
	Product getProduct(Long id);
	
	Order getOrder(Long id);
	
	void sendSomething(Product product);
	
	Shop getProductShop(Product product);
	
	List<Order> getAllOrders();
	
	Order registerOrder(List<Product> products, Shop shop);
}
