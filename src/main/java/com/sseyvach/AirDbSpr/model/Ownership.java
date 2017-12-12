package com.sseyvach.AirDbSpr.model;

import javax.persistence.*;
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
    @Min(1)
    private int ownershipIdCompanies;

    @Column (name = "id_aircraft")
    @NotNull
    @Min(1)
    private int ownershipIdAircraft;

    @Column (name = "quantity")
    @NotNull
    @Min(0)
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
