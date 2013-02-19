package com.magazine;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.WebServiceContext;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, parameterStyle=SOAPBinding.ParameterStyle.WRAPPED, use=SOAPBinding.Use.LITERAL)
public class ShopWebService implements IShopWebService {

	@Resource
	WebServiceContext context;
	
	@Override
	@WebMethod
	public Shop getShop(Long id) {
		Shop shop = new Shop();
		shop.setId(id);
		shop.setProducts(getProducts(shop));
		return shop;
	}

	@Override
	public Product getProduct(Long id) {
		Product pr = new Product();
		pr.setId(id);
		return pr;
	}

	@Override
	@WebMethod
	public Order getOrder(Long id) {
		Order ord = new Order();
		ord.setId(id);
		ord.setDeliveryDate(new Date());
		ord.setDeliveryRegisterDate(new Date());
		ord.setProducts(getProducts(new Shop()));
		return null;
	}

	@Override
	@WebMethod
	public Shop getProductShop(Product product) {
		return product.getShop();
	}

	@Override
	@WebMethod
	public List<Order> getAllOrders() {
		return new ArrayList<Order>(0);
	}

	@Override
	@WebMethod
	public Order registerOrder(List<Product> products, Shop shop) {
		Order ord= new Order();
		ord.setProducts(products);
		ord.setId(981L);
		ord.setDeliveryRegisterDate(new Date());
		ord.setDeliveryDate(new Date());
		return ord;
	}
	
	@WebMethod(exclude=true)
	public List<Product> getProducts(Shop shop) {
		List products = new ArrayList<Product>(3);
		Product pr1 = new Product();
		pr1.setId(1l);
		pr1.setName("Nice Table");
		pr1.setSalesEnd(new Date());
		pr1.setSalesStart(new Date());
		pr1.setShop(shop);
		pr1.setComments("its really nice!");
		products.add(pr1);
		Product pr2 = new Product();
		pr2.setId(2l);
		pr2.setName("Nice chair");
		pr2.setSalesEnd(new Date());
		pr2.setSalesStart(new Date());
		pr2.setShop(shop);
		pr2.setComments("Like a table");
		products.add(pr2);
		Product pr3 = new Product();
		pr3.setId(3l);
		pr3.setName("TV!");
		pr3.setSalesEnd(new Date());
		pr3.setSalesStart(new Date());
		pr3.setShop(shop);
		pr3.setComments("Dont watch it");
		products.add(pr3);
		return products;
	}
	
	private void someMethod() {
	}
	
	@WebMethod(exclude=true)
	public void someOtherMethod() {
	}

	@Override
	@WebMethod
	@Oneway
	public void sendSomething(Product product) {
		//handling
	}
}
