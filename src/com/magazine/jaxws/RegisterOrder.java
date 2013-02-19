
package com.magazine.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "registerOrder", namespace = "http://magazine.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerOrder", namespace = "http://magazine.com/", propOrder = {
    "arg0",
    "arg1"
})
public class RegisterOrder {

    @XmlElement(name = "arg0", namespace = "")
    private List<com.magazine.Product> arg0;
    @XmlElement(name = "arg1", namespace = "")
    private com.magazine.Shop arg1;

    /**
     * 
     * @return
     *     returns List<Product>
     */
    public List<com.magazine.Product> getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(List<com.magazine.Product> arg0) {
        this.arg0 = arg0;
    }

    /**
     * 
     * @return
     *     returns Shop
     */
    public com.magazine.Shop getArg1() {
        return this.arg1;
    }

    /**
     * 
     * @param arg1
     *     the value for the arg1 property
     */
    public void setArg1(com.magazine.Shop arg1) {
        this.arg1 = arg1;
    }

}
