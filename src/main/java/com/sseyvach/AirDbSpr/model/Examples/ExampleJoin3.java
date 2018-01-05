package com.sseyvach.AirDbSpr.model.Examples;

public class ExampleJoin3 {
    private String companyName;
    private String companyCountry;
    private int ownershipQuantity;

    public ExampleJoin3(String companyName, String companyCountry, int ownershipQuantity) {
        this.companyName = companyName;
        this.companyCountry = companyCountry;
        this.ownershipQuantity = ownershipQuantity;
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

    public int getOwnershipQuantity() {
        return ownershipQuantity;
    }

    public void setOwnershipQuantity(int ownershipQuantity) {
        this.ownershipQuantity = ownershipQuantity;
    }

    @Override
    public String toString() {
        return "ExampleJoin3{" +
                "companyName='" + companyName + '\'' +
                ", companyCountry='" + companyCountry + '\'' +
                ", ownershipQuantity=" + ownershipQuantity +
                '}';
    }
}
