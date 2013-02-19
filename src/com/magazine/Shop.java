package com.magazine;

import java.io.Serializable;
import java.util.List;

public class Shop implements Serializable {
	
	private static final long serialVersionUID = 1851799648009659538L;
	
	private Long id;
	private String name;
	private List<Product> products;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
