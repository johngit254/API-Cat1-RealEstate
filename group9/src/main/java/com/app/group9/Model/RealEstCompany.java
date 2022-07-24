package com.app.group9.Model;


import javax.persistence.*;

@Entity
@Table (name="COMPANY_NAME")
public class RealEstCompany {

    @Id
    @Column(name="Company_ID")
    private Long companyID;
    @Column(name="Company_Name")
    private String companyName;
    @Column(name="Contact")
    private int telephoneNo;

   /* @OneToMany
    @JoinColumn(name="Property_ID")
    private Property property;

    */

    public RealEstCompany(Long companyID, String companyName, int telephoneNo) {
        this.companyID = companyID;
        this.companyName = companyName;
        this.telephoneNo = telephoneNo;
    }

    public RealEstCompany () {

    }

    public Long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Long companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(int telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    @Override
    public String toString() {
        return "RealEstCompany{" +
                "companyID=" + companyID +
                ", companyName='" + companyName + '\'' +
                ", telephoneNo=" + telephoneNo +
                '}';
    }
}
