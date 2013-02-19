
package com.magazine.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getProductShopResponse", namespace = "http://magazine.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductShopResponse", namespace = "http://magazine.com/")
public class GetProductShopResponse {

    @XmlElement(name = "return", namespace = "")
    private com.magazine.Shop _return;

    /**
     * 
     * @return
     *     returns Shop
     */
    public com.magazine.Shop getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.magazine.Shop _return) {
        this._return = _return;
    }

}
