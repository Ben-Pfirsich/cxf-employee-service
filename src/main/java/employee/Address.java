
package employee;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="fromdate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="todate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="address" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "address")
public class Address {

    @XmlAttribute(name = "fromdate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromdate;
    @XmlAttribute(name = "todate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar todate;
    @XmlAttribute(name = "address", required = true)
    protected String address;

    /**
     * Ruft den Wert der fromdate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromdate() {
        return fromdate;
    }

    /**
     * Legt den Wert der fromdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromdate(XMLGregorianCalendar value) {
        this.fromdate = value;
    }

    /**
     * Ruft den Wert der todate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTodate() {
        return todate;
    }

    /**
     * Legt den Wert der todate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTodate(XMLGregorianCalendar value) {
        this.todate = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

}
