package demo.entity.service;


import demo.entity.model.Employee;

import java.util.List;

/**
 * Created by gersomlopez on 7/7/14.
 */
public interface EmployeeService {
    public List<Employee> findAll();

    public Employee get(Integer ID);

    public void delete(Integer ID);

    public void saveOrUpdate(Employee employee);

    public Employee create();
}
