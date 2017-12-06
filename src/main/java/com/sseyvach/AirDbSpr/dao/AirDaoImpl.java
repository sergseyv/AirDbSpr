package com.sseyvach.AirDbSpr.dao;

import com.sseyvach.AirDbSpr.model.Aircraft;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class AirDaoImpl implements AirDao {

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addAir(Aircraft aircraft) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(aircraft);
    }

    @Override
    public void updateAir(Aircraft aircraft) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(aircraft);

    }

    @Override
    public void removeAir(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Aircraft aircraft = (Aircraft) session.load (Aircraft.class, id);
        if (aircraft != null) session.delete(aircraft);

    }

    @Override
    public Aircraft getAirById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Aircraft aircraft = (Aircraft) session.load (Aircraft.class, id);
        return aircraft;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Aircraft> listAirs() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Aircraft> airlist = session.createQuery("from Aircraft").list();
        return airlist;
    }
}
