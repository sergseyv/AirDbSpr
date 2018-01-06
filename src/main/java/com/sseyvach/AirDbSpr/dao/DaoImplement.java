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
    public void remove(IDBRecord dbRecord) {
        Session session = this.sessionFactory.getCurrentSession();
        session.delete(dbRecord);
    }

    @Override
    public IDBRecord getById(Class clazz, int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return (IDBRecord) session.get (clazz, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<IDBRecord> listRecords(Class clazz) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery ( "from " + clazz.getSimpleName() ).list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Object[]> listJoins1() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery (
                " SELECT o.ownershipId, c.companyName, c.companyCountry, a.aircraftName, o.ownershipQuantity " +
                " FROM Ownership o " +
                " JOIN Company c ON o.ownershipIdCompanies = c.companyId " +
                " JOIN Aircraft a ON o.ownershipIdAircraft = a.aircraftId "
        ).getResultList();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Object[]> listJoins2() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery(
                " SELECT c.companyName, c.companyCountry, a.aircraftName, a.aircraftMaxRangeKm, o.ownershipQuantity " +
                " FROM Ownership o " +
                " JOIN Company c ON o.ownershipIdCompanies = c.companyId " +
                " JOIN Aircraft a ON o.ownershipIdAircraft = a.aircraftId " +
                " WHERE a.aircraftName LIKE '%Airbus%' " +
                " ORDER BY a.aircraftMaxRangeKm ASC "
        ).getResultList();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Object[]> listJoins3() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery(
                " SELECT c.companyName, c.companyCountry, SUM(o.ownershipQuantity) " +
                " FROM Ownership o " +
                " JOIN Company c ON o.ownershipIdCompanies = c.companyId " +
                " JOIN Aircraft a ON o.ownershipIdAircraft = a.aircraftId " +
                " WHERE a.aircraftName LIKE '%Boeing%' " +
                " GROUP BY o.ownershipIdCompanies " +
                " ORDER BY SUM(o.ownershipQuantity) DESC "
        ).getResultList();
    }

}
