package com.sseyvach.AirDbSpr.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "aircrafts")
public class Aircraft implements IDBRecord {

    @Id
    @Column(name = "id_aircraft")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aircraftId;

    @Column (name = "name")
    @NotNull(message="Please enter the name")
    @Size(min=2, max=50, message="The name must be from 2 to 50 letters")
    private String aircraftName;

    @Column (name = "passengers")
    @NotNull(message="Please enter the number")
    @Min(value = 0, message = "Please enter the number from 0 to 1 000 000")
    @Max(value = 1000000, message = "Please enter the number from 0 to 1 000 000")
    private int aircraftPassengers;

    @Column (name = "max_weight__kg")
    @NotNull(message="Please enter the number")
    @Min(value = 0, message = "Please enter the number from 0 to 1 000 000")
    @Max(value = 1000000, message = "Please enter the number from 0 to 1 000 000")
    private int aircraftMaxWeightKg;

    @Column (name = "max_range__km")
    @NotNull(message="Please enter the number")
    @Min(value = 0, message = "Please enter the number from 0 to 1 000 000")
    @Max(value = 1000000, message = "Please enter the number from 0 to 1 000 000")
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
