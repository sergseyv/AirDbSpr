package com.sseyvach.AirDbSpr.service;

import com.sseyvach.AirDbSpr.model.Examples.ExampleJoin1;
import com.sseyvach.AirDbSpr.model.IDBRecord;

import java.util.List;

public interface IService {
    void add (IDBRecord dbRecord);
    void update (IDBRecord dbRecord);
    void remove (IDBRecord dbRecord);
    IDBRecord getById (Class clazz, int id);
    List<IDBRecord> listRecords(Class clazz);

    List<ExampleJoin1> listExampleJoin1();
}

