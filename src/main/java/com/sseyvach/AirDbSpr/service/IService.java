package com.sseyvach.AirDbSpr.service;

import com.sseyvach.AirDbSpr.model.DBRecord;

import java.util.List;

public interface IService {
    void add (DBRecord dbRecord);
    void update (DBRecord dbRecord);
    void remove (Class clazz, int id);
    DBRecord getById (Class clazz, int id);
    List<DBRecord> listRecords(Class clazz);
}
