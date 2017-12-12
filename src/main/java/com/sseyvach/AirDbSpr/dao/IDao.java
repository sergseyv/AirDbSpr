package com.sseyvach.AirDbSpr.dao;

import com.sseyvach.AirDbSpr.model.IDBRecord;

import java.util.List;

public interface IDao {
    void add (IDBRecord dbRecord);
    void update (IDBRecord dbRecord);
    void remove (Class clazz, int id);
    IDBRecord getById (Class clazz, int id);
    List<IDBRecord> listIhha(Class clazz);

}
