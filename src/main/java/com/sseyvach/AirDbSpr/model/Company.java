package com.sseyvach.AirDbSpr.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table (name = "companies")
public class Company implements IDBRecord {

    @Id
    @Column (name = "id_companies")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int companyId;

    @Column (name = "name")
    @Size(min=2, max=50)
    private String companyName;

    @Column (name = "country")
    @Size(min=2, max=50)
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
