package com.marco.assignment.Services.employee.impl;

import com.marco.assignment.Services.employee.employeeservice.EmployeeService;
import com.marco.assignment.Services.employee.impl.EmployeeServiceImpl;
import com.marco.assignment.domain.employee.Employee;
import com.marco.assignment.factory.employee.EmployeeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceImplTest {
    private EmployeeService service;
    private Employee employee;

    private Employee getRepo(){
        for(Employee employeeA : service.getAllEmployees()){
            if(employeeA.getEmployeeID() == employee.getEmployeeID()){
                return employeeA;
            }
        }
        return null;
    }

    @Before
    public void setUp() throws Exception {
        service = EmployeeServiceImpl.getService();
        //this.repository = AnnouncerRepositoryImpl.getRepository(); //was used to initialize the repository impl. and initialize the dataSet

        employee = EmployeeFactory.buildEmployee(1, "Marco", "Ross");
    }

    @Test
    public void d_getAllEmployees() {
        Set<Employee> setList = service.getAllEmployees();
        Assert.assertEquals(1, setList.size());
    }

    @Test
    public void a_create() {
        Employee employeeTest = this.service.create(employee);

        Assert.assertEquals(employee, employeeTest);
    }

    @Test
    public void c_update() {
        Assert.assertNotNull(getRepo());
        String employeeSurnameChange = "Boss";
        Employee updated = new Employee.Builder().copy(getRepo()).employeeLastName(employeeSurnameChange).build();

        this.service.update(updated);

        Assert.assertEquals(employeeSurnameChange, updated.getEmployeeLastName());
        System.out.println("EmployeeLastName updated");
    }

    @Test
    public void e_delete() {
        service.delete(employee.getEmployeeID());
        Set<Employee> employee = service.getAllEmployees();
        Assert.assertEquals(0, employee.size());
    }

    @Test
    public void b_read() {
        Employee employeeList = service.read(1);
        Assert.assertEquals(employee.getEmployeeID(), employeeList.getEmployeeID());
    }
}