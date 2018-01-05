package com.sseyvach.AirDbSpr.model.Examples;

public class ExampleJoin4 {
    private String companyName;
    private String companyCountry;
    private int ownershipQuantity;
    private int aircraftPassengers;

    public ExampleJoin4(String companyName, String companyCountry, int ownershipQuantity, int aircraftPassengers) {
        this.companyName = companyName;
        this.companyCountry = companyCountry;
        this.ownershipQuantity = ownershipQuantity;
        this.aircraftPassengers = aircraftPassengers;
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

    public int getAircraftPassengers() {
        return aircraftPassengers;
    }

    public void setAircraftPassengers(int aircraftPassengers) {
        this.aircraftPassengers = aircraftPassengers;
    }

    @Override
    public String toString() {
        return "ExampleJoin4{" +
                "companyName='" + companyName + '\'' +
                ", companyCountry='" + companyCountry + '\'' +
                ", ownershipQuantity=" + ownershipQuantity +
                ", aircraftPassengers=" + aircraftPassengers +
                '}';
    }
}
