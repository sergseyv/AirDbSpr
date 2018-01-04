package com.sseyvach.AirDbSpr.service;

import com.sseyvach.AirDbSpr.dao.IDao;
import com.sseyvach.AirDbSpr.model.IDBRecord;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public class ServiceImplement implements IService {

    private IDao dao;
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    @Transactional
    public void add(IDBRecord dbRecord) {
        this.dao.add(dbRecord);
    }

    @Override
    @Transactional
    public void update(IDBRecord dbRecord) {
        this.dao.update(dbRecord);
    }

    @Override
    @Transactional
    public void remove(IDBRecord dbRecord) {
        this.dao.remove(dbRecord);
    }

    @Override
    @Transactional
    public IDBRecord getById(Class clazz, int id) {
        return this.dao.getById(clazz, id);
    }

    @Override
    @Transactional
    public List<IDBRecord> listRecords(Class clazz) {
        return this.dao.listRecords(clazz);
    }
}
