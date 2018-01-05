package com.sseyvach.AirDbSpr.model.Examples;

public class ExampleJoin3 {
    private String companyName;
    private String companyCountry;
    private Long sumOwnershipQuantity;

    public ExampleJoin3(String companyName, String companyCountry, Long sumOwnershipQuantity) {
        this.companyName = companyName;
        this.companyCountry = companyCountry;
        this.sumOwnershipQuantity = sumOwnershipQuantity;
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

    public Long getSumOwnershipQuantity() {
        return sumOwnershipQuantity;
    }

    public void setSumOwnershipQuantity(Long sumOwnershipQuantity) {
        this.sumOwnershipQuantity = sumOwnershipQuantity;
    }

    @Override
    public String toString() {
        return "ExampleJoin3{" +
                "companyName='" + companyName + '\'' +
                ", companyCountry='" + companyCountry + '\'' +
                ", sumOwnershipQuantity=" + sumOwnershipQuantity +
                '}';
    }
}
