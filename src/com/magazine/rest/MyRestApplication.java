package com.magazine.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class MyRestApplication extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> classes =  new HashSet<Class<?>>();
    classes.add(OrderResource.class);
    classes.add(ProductResource.class);
    classes.add(ShopResource.class);
    classes.add(SystemResource.class);
    return classes;
  }
  
}
