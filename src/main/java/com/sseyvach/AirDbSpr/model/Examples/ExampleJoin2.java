package com.sseyvach.AirDbSpr.model.Examples;

public class ExampleJoin2 {
    private String companyName;
    private String companyCountry;
    private String aircraftName;
    private int aircraftMaxRangeKm;
    private int ownershipQuantity;

    public ExampleJoin2(String companyName, String companyCountry, String aircraftName, int aircraftMaxRangeKm, int ownershipQuantity) {
        this.companyName = companyName;
        this.companyCountry = companyCountry;
        this.aircraftName = aircraftName;
        this.aircraftMaxRangeKm = aircraftMaxRangeKm;
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

    public int getAircraftMaxRangeKm() {
        return aircraftMaxRangeKm;
    }

    public void setAircraftMaxRangeKm(int aircraftMaxRangeKm) {
        this.aircraftMaxRangeKm = aircraftMaxRangeKm;
    }

    public int getOwnershipQuantity() {
        return ownershipQuantity;
    }

    public void setOwnershipQuantity(int ownershipQuantity) {
        this.ownershipQuantity = ownershipQuantity;
    }

    @Override
    public String toString() {
        return "ExampleJoin2{" +
                "companyName='" + companyName + '\'' +
                ", companyCountry='" + companyCountry + '\'' +
                ", aircraftName='" + aircraftName + '\'' +
                ", aircraftMaxRangeKm=" + aircraftMaxRangeKm +
                ", ownershipQuantity=" + ownershipQuantity +
                '}';
    }
}
