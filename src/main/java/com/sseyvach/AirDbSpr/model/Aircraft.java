package com.sseyvach.AirDbSpr.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "aircrafts")
public class Aircraft implements IDBRecord {

    @Id
    @Column(name = "id_aircraft")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aircraftId;

    @Column (name = "name")
    @NotNull
    @NotEmpty
    @Size(min=2, max=50)
    private String aircraftName;

    @Column (name = "passengers")
    @NotNull
    @Digits(integer=5, fraction=0)
    @Min(value = 0)
    @Max(value = 10000)
    private int aircraftPassengers;

    @Column (name = "max_weight__kg")
    @NotNull
    @Digits(integer=7, fraction=0)
    @Min(value = 0)
    @Max(value = 1000000)
    private int aircraftMaxWeightKg;

    @Column (name = "max_range__km")
    @NotNull
    @Digits(integer=6, fraction=0)
    @Min(value = 0)
    @Max(value = 100000)
    private int aircraftMaxRangeKm;


    public int getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(int aircraftId) {
        this.aircraftId = aircraftId;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public int getAircraftPassengers() {
        return aircraftPassengers;
    }

    public void setAircraftPassengers(int aircraftPassengers) {
        this.aircraftPassengers = aircraftPassengers;
    }

    public int getAircraftMaxWeightKg() {
        return aircraftMaxWeightKg;
    }

    public void setAircraftMaxWeightKg(int aircraftMaxWeightKg) {
        this.aircraftMaxWeightKg = aircraftMaxWeightKg;
    }

    public int getAircraftMaxRangeKm() {
        return aircraftMaxRangeKm;
    }

    public void setAircraftMaxRangeKm(int aircraftMaxRangeKm) {
        this.aircraftMaxRangeKm = aircraftMaxRangeKm;
    }

}
