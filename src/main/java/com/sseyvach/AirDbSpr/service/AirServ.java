package com.sseyvach.AirDbSpr.service;

import com.sseyvach.AirDbSpr.model.Aircraft;
import java.util.List;

public interface AirServ {

    void addAir (Aircraft aircraft);
    void updateAir (Aircraft aircraft);
    void removeAir (int id);
    Aircraft getAirById (int id);
    List<Aircraft> listAirs();
}
