package com.marco.assignment.repository.impl;

import com.marco.assignment.domain.Employee;
import com.marco.assignment.factory.EmployeeFactory;
import com.marco.assignment.repository.employeerepo.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRepositoryImplTest {
    private EmployeeRepository repository;
    private Employee employee;

    private Employee getRepo(){
        for(Employee employeeA : repository.getAllEmployees()){
            if(employeeA.getEmployeeID() == employee.getEmployeeID()){
                return employeeA;
            }
        }
        return null;
    }

    @Before
    public void setUp() throws Exception {
        repository = EmployeeRepositoryImpl.getRepository();
        //this.repository = AnnouncerRepositoryImpl.getRepository(); //was used to initialize the repository impl. and initialize the dataSet

        employee = EmployeeFactory.buildEmployee(1, "Marco", "Ross");
    }

    @Test
    public void d_getAllEmployees() {
        Set<Employee> setList = repository.getAllEmployees();
        Assert.assertEquals(1, setList.size());
    }

    @Test
    public void a_create() {
        Employee employeeTest = this.repository.create(employee);

        Assert.assertEquals(employee, employeeTest);
    }

    @Test
    public void c_update() {
        Assert.assertNotNull(getRepo());
        String employeeSurnameChange = "Boss";
        Employee updated = new Employee.Builder().copy(getRepo()).employeeLastName(employeeSurnameChange).build();

        this.repository.update(updated);

        Assert.assertEquals(employeeSurnameChange, updated.getEmployeeLastName());
        System.out.println("EmployeeLastName updated");
    }

    @Test
    public void e_delete() {
        repository.delete(employee.getEmployeeID());
        Set<Employee> employee = repository.getAllEmployees();
        Assert.assertEquals(0, employee.size());
    }

    @Test
    public void b_read() {
        Employee employeeList = repository.read(1);
        Assert.assertEquals(employee.getEmployeeID(), employeeList.getEmployeeID());
    }
}