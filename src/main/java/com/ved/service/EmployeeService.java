package com.ved.service;

import com.ved.dao.EmployeeDao;
import com.ved.model.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeService(){
        this.employeeDao = new EmployeeDao();
    }

    @Override
    public List<Employee> fetchAllEmployees() throws SQLException,ClassNotFoundException{
        return employeeDao.getAllEmployees();
    }

    @Override
    public boolean addEmployee(Employee employee) throws SQLException, ClassNotFoundException {
        return employeeDao.addEmployee(employee);

    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException, ClassNotFoundException {
        return employeeDao.deleteEmployee(id);
    }

    @Override
    public boolean updateEmployee(Employee employee) throws SQLException, ClassNotFoundException {
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public Employee fetchEmployeeByID(int id) throws SQLException, ClassNotFoundException {
        return employeeDao.fetchEmployeeByID(id);
       // return false;
    }
}
