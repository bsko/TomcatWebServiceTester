package com.magazine;

import java.io.Serializable;
import java.util.Date;

import com.magazine.storage.MagazineStorage;

public class Product implements Serializable {
	
	private static final long serialVersionUID = -6356076553378879089L;
	
	private Long id;
	private String name;
	private String comments;
	private Date salesStart;
	private Date salesEnd;
	private Shop shop;
	
	public Product() {
		setId(MagazineStorage.instance().registerProduct());
	}
	
	public Product(String name, String comments, Date salesStart, Date salesEnd) {
		this();
		this.name = name;
		this.comments = comments;
		this.salesStart = salesStart;
		this.salesEnd = salesEnd;
	}
	
	public Product register(Long id) {
		this.id = id;
		return this;
	}
	
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getSalesStart() {
		return salesStart;
	}
	public void setSalesStart(Date salesStart) {
		this.salesStart = salesStart;
	}
	public Date getSalesEnd() {
		return salesEnd;
	}
	public void setSalesEnd(Date salesEnd) {
		this.salesEnd = salesEnd;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
}
