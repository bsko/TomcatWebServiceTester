package com.magazine;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
	
	private static final long serialVersionUID = -8477522635632620523L;
	
	private Long id;
	private Date deliveryRegisterDate;
	private Date deliveryDate;
	private List<Product> products;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDeliveryRegisterDate() {
		return deliveryRegisterDate;
	}
	public void setDeliveryRegisterDate(Date deliveryRegisterDate) {
		this.deliveryRegisterDate = deliveryRegisterDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
