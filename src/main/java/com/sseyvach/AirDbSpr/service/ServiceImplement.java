package com.sseyvach.AirDbSpr.service;

import com.sseyvach.AirDbSpr.dao.IDao;
import com.sseyvach.AirDbSpr.model.Examples.ExampleJoin1;
import com.sseyvach.AirDbSpr.model.Examples.ExampleJoin2;
import com.sseyvach.AirDbSpr.model.Examples.ExampleJoin3;
import com.sseyvach.AirDbSpr.model.IDBRecord;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
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

    @Override
    @Transactional
    public List<ExampleJoin1> listExampleJoin1(){
        List<ExampleJoin1> ejList = new ArrayList<>();
        for (Object[] result : this.dao.listJoins1()) {
            ejList.add ( new ExampleJoin1( (Integer)result[0], (String)result[1], (String)result[2],
                                           (String)result[3], (Integer)result[4]));
        }
        return ejList;
    }

    @Override
    @Transactional
    public List<ExampleJoin2> listExampleJoin2(){
        List<ExampleJoin2> ejList = new ArrayList<>();
        for (Object[] result : this.dao.listJoins2()) {
            ejList.add ( new ExampleJoin2( (String)result[0], (String)result[1], (String)result[2],
                                           (Integer)result[3], (Integer)result[4]));
        }
        return ejList;
    }

    @Override
    @Transactional
    public List<ExampleJoin3> listExampleJoin3(){
        List<ExampleJoin3> ejList = new ArrayList<>();
        for (Object[] result : this.dao.listJoins3()) {
            ejList.add ( new ExampleJoin3( (String)result[0], (String)result[1], (Long)result[2]));
        }
        return ejList;
    }

}
