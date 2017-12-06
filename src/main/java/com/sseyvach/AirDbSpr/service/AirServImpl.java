package com.sseyvach.AirDbSpr.service;

import com.sseyvach.AirDbSpr.dao.AirDao;
import com.sseyvach.AirDbSpr.model.Aircraft;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AirServImpl implements AirServ {

    private AirDao airDao;
    public void setAirDao(AirDao airDao) {
        this.airDao = airDao;
    }

    @Override
    @Transactional
    public void addAir(Aircraft aircraft) {
        this.airDao.addAir(aircraft);
    }

    @Override
    @Transactional
    public void updateAir(Aircraft aircraft) {
        this.airDao.updateAir(aircraft);
    }

    @Override
    @Transactional
    public void removeAir(int id) {
        this.airDao.removeAir(id);
    }

    @Override
    @Transactional
    public Aircraft getAirById(int id) {
        return this.airDao.getAirById(id);
    }

    @Override
    @Transactional
    public List<Aircraft> listAirs() {
        return this.airDao.listAirs();
    }
}
