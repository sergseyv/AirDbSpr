package com.sseyvach.AirDbSpr.dao;

import com.sseyvach.AirDbSpr.model.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ComDaoImpl implements ComDao {

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addCom(Company company) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(company);
    }

    @Override
    public void updateCom(Company company) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(company);
    }

    @Override
    public void removeCom(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Company company = (Company) session.load (Company.class, id);
        if (company != null) session.delete(company);
    }

    @Override
    public Company getComById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Company company = (Company) session.load (Company.class, id);
        return company;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Company> listComs() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Company> comlist = session.createQuery("from Company").list();
        return comlist;
    }
}
