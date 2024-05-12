package com.JFS6WDE.SpringJunitDemo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JFS6WDE.SpringJunitDemo.Entity.Employee;
import com.JFS6WDE.SpringJunitDemo.Services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

@Autowired
private EmployeeService empService;

@GetMapping("/all")
public List<Employee> getAllEmployees(){
    return empService.findAllEmployee();
}

@GetMapping("/{id}")
public Optional<Employee> getEmployeeById(@PathVariable int id){
 return empService.findEmployeeById(id);
}

@PostMapping("/save")
public Employee saveEmployee(@RequestBody Employee emp){
    return empService.savEmployeeData(emp);
}

@DeleteMapping("/{id}")
public void deleteById(@PathVariable int id){
    empService.deleteEmployeeByid(id);
}
}
