package com.sseyvach.AirDbSpr.dao;

import com.sseyvach.AirDbSpr.model.DBRecord;
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
    public void add(DBRecord dbRecord) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(dbRecord);
    }

    @Override
    public void update(DBRecord dbRecord) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(dbRecord);
    }

    @Override
    public void remove(Class clazz, int id) {
        Session session = this.sessionFactory.getCurrentSession();
        DBRecord dbRecord = (DBRecord) session.load (clazz, id);
        if (dbRecord != null) session.delete(dbRecord);
    }

    @Override
    public DBRecord getById(Class clazz, int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return (DBRecord) session.load (clazz, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<DBRecord> listIhha(Class clazz) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery ( "from " + clazz.getSimpleName() ).list();
    }
}
