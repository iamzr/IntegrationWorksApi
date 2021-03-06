//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.25 at 10:37:11 PM GMT 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerFirst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerLast" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShippingAddress">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShippingAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ShippingAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PurchaseOrderLines">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PurchaseOrderLine" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="itemID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerFirst",
    "customerLast",
    "company",
    "shippingAddress",
    "purchaseOrderLines"
})
@XmlRootElement(name = "PurchaseOrder")
public class PurchaseOrder {

    @XmlElement(name = "CustomerFirst", required = true)
    protected String customerFirst;
    @XmlElement(name = "CustomerLast", required = true)
    protected String customerLast;
    @XmlElement(name = "Company", required = true)
    protected String company;
    @XmlElement(name = "ShippingAddress", required = true)
    protected PurchaseOrder.ShippingAddress shippingAddress;
    @XmlElement(name = "PurchaseOrderLines", required = true)
    protected PurchaseOrder.PurchaseOrderLines purchaseOrderLines;

    /**
     * Gets the value of the customerFirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirst() {
        return customerFirst;
    }

    /**
     * Sets the value of the customerFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirst(String value) {
        this.customerFirst = value;
    }

    /**
     * Gets the value of the customerLast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLast() {
        return customerLast;
    }

    /**
     * Sets the value of the customerLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLast(String value) {
        this.customerLast = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrder.ShippingAddress }
     *     
     */
    public PurchaseOrder.ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrder.ShippingAddress }
     *     
     */
    public void setShippingAddress(PurchaseOrder.ShippingAddress value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the purchaseOrderLines property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrder.PurchaseOrderLines }
     *     
     */
    public PurchaseOrder.PurchaseOrderLines getPurchaseOrderLines() {
        return purchaseOrderLines;
    }

    /**
     * Sets the value of the purchaseOrderLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrder.PurchaseOrderLines }
     *     
     */
    public void setPurchaseOrderLines(PurchaseOrder.PurchaseOrderLines value) {
        this.purchaseOrderLines = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PurchaseOrderLine" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="itemID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "purchaseOrderLine"
    })
    public static class PurchaseOrderLines {

        @XmlElement(name = "PurchaseOrderLine")
        protected List<PurchaseOrder.PurchaseOrderLines.PurchaseOrderLine> purchaseOrderLine;

        /**
         * Gets the value of the purchaseOrderLine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the purchaseOrderLine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPurchaseOrderLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PurchaseOrder.PurchaseOrderLines.PurchaseOrderLine }
         * 
         * 
         */
        public List<PurchaseOrder.PurchaseOrderLines.PurchaseOrderLine> getPurchaseOrderLine() {
            if (purchaseOrderLine == null) {
                purchaseOrderLine = new ArrayList<PurchaseOrder.PurchaseOrderLines.PurchaseOrderLine>();
            }
            return this.purchaseOrderLine;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="itemID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "itemID",
            "itemName",
            "qty",
            "cost",
            "currency"
        })
        public static class PurchaseOrderLine {

            protected int itemID;
            @XmlElement(required = true)
            protected String itemName;
            protected byte qty;
            protected byte cost;
            @XmlElement(required = true)
            protected String currency;

            /**
             * Gets the value of the itemID property.
             * 
             */
            public int getItemID() {
                return itemID;
            }

            /**
             * Sets the value of the itemID property.
             * 
             */
            public void setItemID(int value) {
                this.itemID = value;
            }

            /**
             * Gets the value of the itemName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemName() {
                return itemName;
            }

            /**
             * Sets the value of the itemName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemName(String value) {
                this.itemName = value;
            }

            /**
             * Gets the value of the qty property.
             * 
             */
            public byte getQty() {
                return qty;
            }

            /**
             * Sets the value of the qty property.
             * 
             */
            public void setQty(byte value) {
                this.qty = value;
            }

            /**
             * Gets the value of the cost property.
             * 
             */
            public byte getCost() {
                return cost;
            }

            /**
             * Sets the value of the cost property.
             * 
             */
            public void setCost(byte value) {
                this.cost = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrency() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrency(String value) {
                this.currency = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ShippingAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ShippingAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "shippingAddressLine1",
        "shippingAddressLine2",
        "city",
        "postcode",
        "country"
    })
    public static class ShippingAddress {

        @XmlElement(name = "ShippingAddressLine1", required = true)
        protected String shippingAddressLine1;
        @XmlElement(name = "ShippingAddressLine2", required = true)
        protected String shippingAddressLine2;
        @XmlElement(name = "City", required = true)
        protected String city;
        @XmlElement(name = "Postcode", required = true)
        protected String postcode;
        @XmlElement(name = "Country", required = true)
        protected String country;

        /**
         * Gets the value of the shippingAddressLine1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShippingAddressLine1() {
            return shippingAddressLine1;
        }

        /**
         * Sets the value of the shippingAddressLine1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShippingAddressLine1(String value) {
            this.shippingAddressLine1 = value;
        }

        /**
         * Gets the value of the shippingAddressLine2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShippingAddressLine2() {
            return shippingAddressLine2;
        }

        /**
         * Sets the value of the shippingAddressLine2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShippingAddressLine2(String value) {
            this.shippingAddressLine2 = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the postcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostcode() {
            return postcode;
        }

        /**
         * Sets the value of the postcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostcode(String value) {
            this.postcode = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

    }

}
