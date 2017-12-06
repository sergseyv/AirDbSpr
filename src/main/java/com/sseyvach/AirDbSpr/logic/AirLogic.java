package com.sseyvach.AirDbSpr.logic;

import com.sseyvach.AirDbSpr.model.Aircraft;
import java.util.List;

public interface AirLogic {

    public void addAir (Aircraft aircraft);
    public void updateAir (Aircraft aircraft);
    public void removeAir (int id);
    public Aircraft getAirById (int id);
    public List<Aircraft> listbooks();
}
