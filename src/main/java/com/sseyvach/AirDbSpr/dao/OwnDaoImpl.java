package com.sseyvach.AirDbSpr.dao;

import com.sseyvach.AirDbSpr.model.Ownership;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class OwnDaoImpl implements OwnDao{

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addOwn(Ownership ownership) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(ownership);
    }

    @Override
    public void updateOwn(Ownership ownership) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(ownership);

    }

    @Override
    public void removeOwn(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Ownership ownership = (Ownership) session.load (Ownership.class, id);
        if (ownership != null) session.delete(ownership);

    }

    @Override
    public Ownership getOwnById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Ownership ownership = (Ownership) session.load (Ownership.class, id);
        return ownership;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Ownership> listOwns() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("from Ownership").list();
    }
}
