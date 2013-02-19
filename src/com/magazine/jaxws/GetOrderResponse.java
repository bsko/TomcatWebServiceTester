
package com.magazine.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getOrderResponse", namespace = "http://magazine.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrderResponse", namespace = "http://magazine.com/")
public class GetOrderResponse {

    @XmlElement(name = "return", namespace = "")
    private com.magazine.Order _return;

    /**
     * 
     * @return
     *     returns Order
     */
    public com.magazine.Order getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.magazine.Order _return) {
        this._return = _return;
    }

}
