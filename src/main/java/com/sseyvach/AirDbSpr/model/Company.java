package com.sseyvach.AirDbSpr.model;

import javax.persistence.*;

@Entity
@Table (name = "companies")
public class Company {

    @Id
    @Column (name = "id_companies")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int companyId;

    @Column (name = "name")
    private String companyName;

    @Column (name = "country")
    private String companyCountry;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCountry() {
        return companyCountry;
    }

    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }

}
