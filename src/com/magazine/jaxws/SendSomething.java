
package com.magazine.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "sendSomething", namespace = "http://magazine.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSomething", namespace = "http://magazine.com/")
public class SendSomething {

    @XmlElement(name = "arg0", namespace = "")
    private com.magazine.Product arg0;

    /**
     * 
     * @return
     *     returns Product
     */
    public com.magazine.Product getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.magazine.Product arg0) {
        this.arg0 = arg0;
    }

}
