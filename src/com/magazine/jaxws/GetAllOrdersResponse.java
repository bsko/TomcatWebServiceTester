
package com.magazine.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllOrdersResponse", namespace = "http://magazine.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllOrdersResponse", namespace = "http://magazine.com/")
public class GetAllOrdersResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.magazine.Order> _return;

    /**
     * 
     * @return
     *     returns List<Order>
     */
    public List<com.magazine.Order> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.magazine.Order> _return) {
        this._return = _return;
    }

}
