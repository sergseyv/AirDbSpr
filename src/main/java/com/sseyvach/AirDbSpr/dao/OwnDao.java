package com.sseyvach.AirDbSpr.dao;

import com.sseyvach.AirDbSpr.model.Ownership;

import java.util.List;

public interface OwnDao {

    void addOwn (Ownership ownership);
    void updateOwn (Ownership ownership);
    void removeOwn (int id);
    Ownership getOwnById (int id);
    List<Ownership> listOwns();
}
