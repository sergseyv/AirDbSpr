package com.sseyvach.AirDbSpr.model.Examples;

public class ExampleJoin1 {
    private String companyName;
    private String companyCountry;
    private String aircraftName;
    private int ownershipQuantity;

    public ExampleJoin1(String companyName, String companyCountry, String aircraftName, int ownershipQuantity) {
        this.companyName = companyName;
        this.companyCountry = companyCountry;
        this.aircraftName = aircraftName;
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

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public int getOwnershipQuantity() {
        return ownershipQuantity;
    }

    public void setOwnershipQuantity(int ownershipQuantity) {
        this.ownershipQuantity = ownershipQuantity;
    }

    @Override
    public String toString() {
        return "ExampleJoin1{" +
                "companyName='" + companyName + '\'' +
                ", companyCountry='" + companyCountry + '\'' +
                ", aircraftName='" + aircraftName + '\'' +
                ", ownershipQuantity=" + ownershipQuantity +
                '}';
    }
}
