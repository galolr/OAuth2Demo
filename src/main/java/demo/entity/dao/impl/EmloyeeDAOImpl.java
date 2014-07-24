package demo.entity.dao.impl;


import demo.entity.dao.EmployeeDAO;
import demo.entity.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by gersomlopez on 7/7/14.
 */

@Component
public class EmloyeeDAOImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> findAll() {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Employee> list = session.createQuery("SELECT e FROM Employee e").list();
        tx.commit();

        return list;
    }

    @Override
    public Employee get(Integer ID) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Employee employee = (Employee) session.get(Employee.class, ID);
        tx.commit();

        return employee;
    }

    @Override
    public void delete(Integer ID) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Employee employee = (Employee) session.get(Employee.class, ID);
        session.delete(employee);
        tx.commit();
    }

    @Override
    public void saveOrUpdate(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(employee);
        tx.commit();
    }

    @Override
    public Employee create() {
        return new Employee();
    }
}
