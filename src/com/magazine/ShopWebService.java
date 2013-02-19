package com.magazine;

import java.util.List;
import javax.annotation.Resource;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.WebServiceContext;

import com.magazine.storage.MagazineStorage;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, parameterStyle=SOAPBinding.ParameterStyle.WRAPPED, use=SOAPBinding.Use.LITERAL)
public class ShopWebService implements IShopWebService {

	@Resource
	WebServiceContext context;
	
	private static MagazineStorage storage = MagazineStorage.instance();
	
	@Override
	@WebMethod
	public Shop getShop(Long id) {
		return storage.getShop(id);
	}

	@Override
	public Product getProduct(Long id) {
		return storage.getProduct(id);
	}

	@Override
	@WebMethod
	public Order getOrder(Long id) {
		return storage.getOrder(id);
	}

	@Override
	@WebMethod
	public List<Order> getAllOrders() {
		return storage.getAllOrders();
	}

	@Override
	@WebMethod
	public Order registerOrder(List<Product> products, String comment) {
		return storage.registerOrder(comment, products);
	}
	
	@WebMethod(exclude=true)
	public List<Product> getProducts(Shop shop) {
		return storage.getProducts(shop);
	}
	
	private void someMethod() {
	}
	
	@WebMethod(exclude=true)
	public void someOtherMethod() {
	}

	@Override
	@WebMethod
	@Oneway
	public void registerOrderOneWay(List<Product> products, String comment) {
		storage.registerOrder(comment, products);
	}
}
