package com.magazine.storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.magazine.*;

public class MagazineStorage {
	
	private Map<Long, Shop> shops = new HashMap<Long, Shop>();
	private Map<Long, Order> orders = new HashMap<Long, Order>();
	private Map<Long, Product> products = new HashMap<Long, Product>();
	
	private Long lastProductId = 0l;
	private Long lastShopId = 0l;
	private Long lastOrderId = 0l;
	
	private static MagazineStorage storage;
	
	private MagazineStorage() {
		init();
	}

	private void init() {
		Product pr1 = new Product("Initial thing", "Excelent thing", new Date(), new Date());
		Product pr2 = new Product("TV", "For football watching", new Date(), new Date());
		Product pr3 = new Product("Alpen gold", "Very tasty", new Date(), new Date());
		Product pr4 = new Product("Lord of the rings tape", "Interesting film", new Date(), new Date());
		Product pr5 = new Product("Bag of candies", "Kids like it", new Date(), new Date());
		addProduct(pr1);
		addProduct(pr2);
		addProduct(pr3);
		addProduct(pr4);
		addProduct(pr5);
		List<Product> list1 = new ArrayList<Product>(2);
		list1.add(pr1);
		list1.add(pr2);
		List<Product> list2 = new ArrayList<Product>(3);
		list1.add(pr1);
		list1.add(pr2);
		list1.add(pr4);
		List<Product> list3 = new ArrayList<Product>(2);
		list1.add(pr3);
		list1.add(pr5);
		Shop sh1 = new Shop("MVideo", list1);
		Shop sh2 = new Shop("Globus", list2);
		Shop sh3 = new Shop("Candy shop", list3);
		addShop(sh1);
		addShop(sh2);
		addShop(sh3);
	}
	
	private void addShop(Shop shop) {
		if(shops.get(shop.getId()) == null) {
			shops.put(shop.getId(), shop);
		}
	}
	
	private void addOrder(Order order) {
		if(orders.get(order.getId()) == null) {
			orders.put(order.getId(), order);
		}
	}
	
	private void addProduct(Product product) {
		if(products.get(product.getId()) == null) {
			products.put(product.getId(), product);
		}
	}
	
	public Shop getShop(Long id) {
		return shops.get(id);
	}
	
	public Order getOrder(Long id) {
		return orders.get(id);
	}
	
	public Product getProduct(Long id) {
		return products.get(id);
	}
	
	public List<Order> getAllOrders() {
		return Arrays.asList(orders.values().toArray(new Order[orders.values().size()]));
	}
	
	public Order registerOrder(String comment, List<Product> products) {
		Order order = new Order(comment, new Date(), new Date(), products);
		addOrder(order);
		return order;
	}
	
	public List<Product> getProducts(Shop shop) {
		return getShop(shop.getId()).getProducts();
	}
	
	
	public Long registerShop() {
		lastShopId++;
		return lastShopId;
	}
	
	public Long registerProduct() {
		lastProductId++;
		return lastProductId;
	}

	public Long registerOrder() {
		lastOrderId++;
		return lastOrderId;
	}
	
	public static MagazineStorage instance() {
		if(storage == null) {
			storage = new MagazineStorage();
		}
		return storage;
	}
	
}
