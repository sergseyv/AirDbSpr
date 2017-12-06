package com.sseyvach.AirDbSpr.dao;

import com.sseyvach.AirDbSpr.model.Aircraft;
import java.util.List;

public interface AirDao {

    public void addAir (Aircraft aircraft);
    public void updateAir (Aircraft aircraft);
    public void removeAir (int id);
    public Aircraft getAirById (int id);
    public List<Aircraft> listbooks();

}
