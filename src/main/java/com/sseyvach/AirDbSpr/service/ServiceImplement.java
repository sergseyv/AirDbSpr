package com.sseyvach.AirDbSpr.service;

import com.sseyvach.AirDbSpr.dao.IDao;
import com.sseyvach.AirDbSpr.model.DBRecord;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ServiceImplement implements IService {

    private IDao dao;
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    @Transactional
    public void add(DBRecord dbRecord) {
        this.dao.add(dbRecord);
    }

    @Override
    @Transactional
    public void update(DBRecord dbRecord) {
        this.dao.update(dbRecord);
    }

    @Override
    @Transactional
    public void remove(Class clazz, int id) {
        this.dao.remove(clazz, id);
    }

    @Override
    @Transactional
    public DBRecord getById(Class clazz, int id) {
        return this.dao.getById(clazz, id);
    }

    @Override
    @Transactional
    public List<DBRecord> listRecords(Class clazz) {
        return this.dao.listIhha(clazz);
    }
}
