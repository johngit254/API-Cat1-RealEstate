package com.app.group9.Model;


import javax.persistence.*;

@Entity
@Table (name="PROPERTY")
public class Property {

    @Id
    @Column(name = "Property_ID")
    private Long prop_id;
    @Column(name = "Type")
    private String propertyType;
    @Column(name = "Property_Price")
    private int price;

    @ManyToOne
    @JoinColumn (name ="Buyer_ID")
    private Buyer buyer;
    @Column(name = "Property_Location")
    private String location;

    public Property(Long prop_id, String propertyType, int price, Buyer buyer, String location) {
        this.prop_id = prop_id;
        this.propertyType = propertyType;
        this.price = price;
        this.buyer = buyer;
        this.location = location;
    }
    public Property(){

    }

    public Long getProp_id() {
        return prop_id;
    }

    public void setProp_id(Long prop_id) {
        this.prop_id = prop_id;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Property{" +
                "prop_id=" + prop_id +
                ", propertyType='" + propertyType + '\'' +
                ", price=" + price +
                ", buyer=" + buyer +
                ", location='" + location + '\'' +
                '}';
    }
}
