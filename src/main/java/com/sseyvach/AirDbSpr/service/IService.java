package com.sseyvach.AirDbSpr.service;

import com.sseyvach.AirDbSpr.model.IDBRecord;

import java.util.List;

public interface IService {
    void add (IDBRecord dbRecord);
    void update (IDBRecord dbRecord);
    void remove (Class clazz, int id);
    IDBRecord getById (Class clazz, int id);
    List<IDBRecord> listRecords(Class clazz);
}
