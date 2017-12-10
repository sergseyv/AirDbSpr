package com.sseyvach.AirDbSpr.service;

import com.sseyvach.AirDbSpr.dao.ComDao;
import com.sseyvach.AirDbSpr.dao.OwnDao;
import com.sseyvach.AirDbSpr.model.Ownership;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class OwnServImpl implements  OwnServ{

    private OwnDao ownDao;
    public void setOwnDao(OwnDao ownDao) {
        this.ownDao = ownDao;
    }

    @Override
    @Transactional
    public void addOwn(Ownership ownership) {
        this.ownDao.addOwn(ownership);
    }

    @Override
    @Transactional
    public void updateOwn(Ownership ownership) {
        this.ownDao.updateOwn(ownership);
    }

    @Override
    @Transactional
    public void removeOwn(int id) {
        this.ownDao.removeOwn(id);
    }

    @Override
    @Transactional
    public Ownership getOwnById(int id) {
        return this.ownDao.getOwnById(id);
    }

    @Override
    @Transactional
    public List<Ownership> listOwns() {
        return this.ownDao.listOwns();
    }
}
