package com.sseyvach.AirDbSpr.dao;

import com.sseyvach.AirDbSpr.model.DBRecord;

import java.util.List;

public interface IDao {
    void add (DBRecord dbRecord);
    void update (DBRecord dbRecord);
    void remove (Class clazz, int id);
    DBRecord getById (Class clazz, int id);
    List<DBRecord> listIhha(Class clazz);

}
