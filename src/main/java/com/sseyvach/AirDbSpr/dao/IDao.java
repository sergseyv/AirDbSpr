package com.sseyvach.AirDbSpr.dao;

import com.sseyvach.AirDbSpr.model.IDBRecord;

import java.util.List;

public interface IDao {
    void add (IDBRecord dbRecord);
    void update (IDBRecord dbRecord);
    void remove (IDBRecord dbRecord);
    IDBRecord getById (Class clazz, int id);
    List<IDBRecord> listRecords(Class clazz);

    List<Object[]> listJoins1();
    List<Object[]> listJoins2();
    List<Object[]> listJoins3();
}
