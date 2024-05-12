package com.JFS6WDE.SpringJunitDemo.TestService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.JFS6WDE.SpringJunitDemo.Entity.Employee;
import com.JFS6WDE.SpringJunitDemo.Repository.EmployeeRepository;
import com.JFS6WDE.SpringJunitDemo.Services.EmployeeService;

public class EmployeeServiceTest {

// Clone the Object.
@Mock
private EmployeeRepository employeeRepository;

// inject the mock object within into class.
@InjectMocks
private EmployeeService employeeService;

// this method will run before each test cases.
@BeforeEach
public void setUp(){
    MockitoAnnotations.openMocks(this);
}

@Test
public void testGetAllTheEmployees(){
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(1, "Vishal", "Testing"));
    employees.add(new Employee(2, "Rahul", "Development"));
    employees.add(new Employee(3, "kunal", "Cyber"));
    employees.add(new Employee(4, "Abhishek", "Mechanical"));
  
// When Repo find all is run, return above list structure to make a test success
    when(employeeRepository.findAll()).thenReturn(employees);
    
    List<Employee> result = employeeService.findAllEmployee();
    assertEquals(4, result.size());
}

@Test
public void testEmployeeSave(){
    Employee emp = new Employee(1, "Vishal", "Testing");
    when(employeeRepository.save(emp)).thenReturn(emp);

    Employee result = employeeService.savEmployeeData(emp);
    assertEquals(emp, result);
    assertEquals("Vishal", result.getName());
    // assertEquals("2", result.getId()) // id is auto generated soo cannot be tested
    assertEquals("Testing", result.getDepartment());

}


@Test
public void testEmployeeById() {
    Employee emp = new Employee(1, "Vishal", "Testing");
    when(employeeRepository.findById(emp.getId())).thenReturn(Optional.of(emp));
    
    Optional<Employee> result = employeeService.findEmployeeById(emp.getId());
    
    assertTrue(result.isPresent()); // Check if result is present
    assertEquals(emp.getId(), result.get().getId()); // Compare IDs
}

}
