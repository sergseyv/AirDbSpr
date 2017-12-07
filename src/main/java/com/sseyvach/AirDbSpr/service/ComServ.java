package com.sseyvach.AirDbSpr.service;

import com.sseyvach.AirDbSpr.model.Company;
import java.util.List;

public interface ComServ {

    void addCom (Company company);
    void updateCom (Company company);
    void removeCom (int id);
    Company getComById (int id);
    List<Company> listComs();

}
