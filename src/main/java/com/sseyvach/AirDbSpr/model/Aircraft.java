package com.sseyvach.AirDbSpr.model;

import javax.persistence.*;

@Entity
@Table (name = "aircrafts")
public class Aircraft {

    @Id
    @Column (name = "id_aircraft")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int aircraftId;

    @Column (name = "name")
    private String aircraftName;

    @Column (name = "passengers")
    private int aircraftPassengers;

    @Column (name = "max_weight__kg")
    private int aircraftMaxWeightKg;

    @Column (name = "max_range__km")
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
