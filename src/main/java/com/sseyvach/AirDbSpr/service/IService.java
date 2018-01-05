package com.sseyvach.AirDbSpr.service;

import com.sseyvach.AirDbSpr.model.Examples.ExampleJoin1;
import com.sseyvach.AirDbSpr.model.Examples.ExampleJoin2;
import com.sseyvach.AirDbSpr.model.Examples.ExampleJoin3;
import com.sseyvach.AirDbSpr.model.Examples.ExampleJoin4;
import com.sseyvach.AirDbSpr.model.IDBRecord;

import java.util.List;

public interface IService {
    void add (IDBRecord dbRecord);
    void update (IDBRecord dbRecord);
    void remove (IDBRecord dbRecord);
    IDBRecord getById (Class clazz, int id);
    List<IDBRecord> listRecords(Class clazz);

    List<ExampleJoin1> listExampleJoin1();
    List<ExampleJoin2> listExampleJoin2();
    List<ExampleJoin3> listExampleJoin3();
    List<ExampleJoin4> listExampleJoin4();
}

