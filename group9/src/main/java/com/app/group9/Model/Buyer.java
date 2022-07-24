package com.app.group9.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BUYER")
public class Buyer {
    @Id
    @Column(name="Buyer_ID")
    private Long buyerID;
    @Column(name="Buyer_Name")
    private String buyerName;
    @Column(name="Phone_Number")
    private int phoneNumber;

    public Buyer(Long buyerID, String buyerName, int phoneNumber) {
        this.buyerID = buyerID;
        this.buyerName = buyerName;
        this.phoneNumber = phoneNumber;
    }

    public Buyer() {

    }

    public Long getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(Long buyerID) {
        this.buyerID = buyerID;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "buyerID=" + buyerID +
                ", buyerName='" + buyerName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
