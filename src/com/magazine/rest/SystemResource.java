package com.magazine.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.transform.Source;
import javax.xml.ws.WebServiceProvider;

@WebServiceProvider
@Path("rest/system")
public class SystemResource {
  
  @Context
  UriInfo info;
  
  Source getInfo(Source source) {
    return new Source() {
      
      @Override
      public void setSystemId(String systemId) {
        // TODO Auto-generated method stub
        
      }
      
      @Override
      public String getSystemId() {
        // TODO Auto-generated method stub
        return null;
      }
    };
  }
  
}
