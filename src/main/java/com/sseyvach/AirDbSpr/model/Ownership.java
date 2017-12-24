package com.sseyvach.AirDbSpr.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "ownership")
public class Ownership implements IDBRecord {

    @Id
    @Column (name = "id_ownership")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int ownershipId;

    @Column (name = "id_companies")
    @NotNull
    @Digits(integer=7, fraction=0)
    @Min(value = 1)
    @Max(value = 1000000)
    private int ownershipIdCompanies;

    @Column (name = "id_aircraft")
    @NotNull
    @Digits(integer=7, fraction=0)
    @Min(value = 1)
    @Max(value = 1000000)
    private int ownershipIdAircraft;

    @Column (name = "quantity")
    @NotNull
    @Digits(integer=6, fraction=0)
    @Min(value = 0)
    @Max(value = 100000)
    private int ownershipQuantity;

    public int getOwnershipId() {
        return ownershipId;
    }

    public void setOwnershipId(int ownershipId) {
        this.ownershipId = ownershipId;
    }

    public int getOwnershipIdCompanies() {
        return ownershipIdCompanies;
    }

    public void setOwnershipIdCompanies(int ownershipIdCompanies) {
        this.ownershipIdCompanies = ownershipIdCompanies;
    }

    public int getOwnershipIdAircraft() {
        return ownershipIdAircraft;
    }

    public void setOwnershipIdAircraft(int ownershipIdAircraft) {
        this.ownershipIdAircraft = ownershipIdAircraft;
    }

    public int getOwnershipQuantity() {
        return ownershipQuantity;
    }

    public void setOwnershipQuantity(int ownershipQuantity) {
        this.ownershipQuantity = ownershipQuantity;
    }

 }
