package com.marco.assignment.repository.employee.impl;

import com.marco.assignment.domain.employee.Employee;
import com.marco.assignment.repository.employee.employeerepo.EmployeeRepository;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static EmployeeRepositoryImpl repository = null;

    private Map<Integer, Employee> employeeMap;

    private EmployeeRepositoryImpl(){
        this.employeeMap = new HashMap<>();
    }

    public static EmployeeRepositoryImpl getRepository(){
        if(repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Employee> getAllEmployees() {
        Collection<Employee> employees = this.employeeMap.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }

    @Override
    public Employee create(Employee employee) {
        this.employeeMap.put(employee.getEmployeeID(), employee);
        return this.employeeMap.get(employee.getEmployeeID());
    }

    @Override
    public Employee update(Employee employee) {
        this.employeeMap.replace(employee.getEmployeeID(), employee);
        return this.employeeMap.get(employee.getEmployeeID());
    }

    @Override
    public void delete(Integer employeeID) {
        this.employeeMap.remove(employeeID);
    }

    @Override
    public Employee read(Integer employeeID) {
        return this.employeeMap.get(employeeID);
    }
}
