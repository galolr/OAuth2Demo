package demo.entity.service.impl;

import demo.entity.dao.EmployeeDAO;
import demo.entity.model.Employee;
import demo.entity.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gersomlopez on 7/7/14.
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Transactional
    public Employee get(Integer ID) {
        return employeeDAO.get(ID);
    }

    @Transactional
    public void delete(Integer ID) {
        employeeDAO.delete(ID);
    }

    @Transactional
    public void saveOrUpdate(Employee employee) {
        employeeDAO.saveOrUpdate(employee);
    }

    @Transactional
    public Employee create() {
        return employeeDAO.create();
    }

}
