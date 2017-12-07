package com.sseyvach.AirDbSpr.service;

import com.sseyvach.AirDbSpr.dao.ComDao;
import com.sseyvach.AirDbSpr.model.Company;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ComServImpl implements ComServ{

    private ComDao comDao;
    public void setComDao(ComDao comDao) {
        this.comDao = comDao;
    }

    @Override
    @Transactional
    public void addCom(Company company) {
        this.comDao.addCom(company);
    }

    @Override
    @Transactional
    public void updateCom(Company company) {
        this.comDao.updateCom(company);
    }

    @Override
    @Transactional
    public void removeCom(int id) {
        this.comDao.removeCom(id);
    }

    @Override
    @Transactional
    public Company getComById(int id) {
        return this.comDao.getComById(id);
    }

    @Override
    @Transactional
    public List<Company> listComs() {
        return this.comDao.listComs();
    }
}
