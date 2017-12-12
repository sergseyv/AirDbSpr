package com.sseyvach.AirDbSpr.dao;

import com.sseyvach.AirDbSpr.model.IDBRecord;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DaoImplement implements IDao {

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(IDBRecord dbRecord) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(dbRecord);
    }

    @Override
    public void update(IDBRecord dbRecord) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(dbRecord);
    }

    @Override
    public void remove(Class clazz, int id) {
        Session session = this.sessionFactory.getCurrentSession();
        IDBRecord dbRecord = (IDBRecord) session.load (clazz, id);
        if (dbRecord != null) session.delete(dbRecord);
    }

    @Override
    public IDBRecord getById(Class clazz, int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return (IDBRecord) session.load (clazz, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<IDBRecord> listIhha(Class clazz) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery ( "from " + clazz.getSimpleName() ).list();
    }
}
