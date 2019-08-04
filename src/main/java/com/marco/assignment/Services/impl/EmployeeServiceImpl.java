package com.marco.assignment.Services.impl;

import com.marco.assignment.Services.employeeservice.EmployeeService;
import com.marco.assignment.domain.Employee;
import com.marco.assignment.repository.employeerepo.EmployeeRepository;
import com.marco.assignment.repository.impl.EmployeeRepositoryImpl;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {
    private static EmployeeService service = null;
    private EmployeeRepository repository;

    public static EmployeeService getService(){
        if(service == null) service = new EmployeeServiceImpl();
        return service;
    }

    private EmployeeServiceImpl(){
        this.repository = EmployeeRepositoryImpl.getRepository();
    }

    @Override
    public Set<Employee> getAllEmployees() {
        return this.repository.getAllEmployees();
    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(Integer employeeID) {
        this.repository.delete(employeeID);
    }

    @Override
    public Employee read(Integer employeeID) {
        return this.repository.read(employeeID);
    }
}
