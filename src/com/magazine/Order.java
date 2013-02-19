package com.magazine;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.magazine.storage.MagazineStorage;

public class Order implements Serializable {
	
	private static final long serialVersionUID = -8477522635632620523L;
	
	private Long id;
	private Date deliveryRegisterDate;
	private Date deliveryDate;
	private String comments;
	private List<Product> products;
	
	public Order() {
		setId(MagazineStorage.instance().registerOrder());
	}
	
	public Order(String comments, Date deliveryRegisterDate, Date deliveryDate, List<Product> products) {
		this();
		this.comments = comments;
		this.deliveryRegisterDate = deliveryRegisterDate;
		this.deliveryDate = deliveryDate;
		this.products = products;
	}
	
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
