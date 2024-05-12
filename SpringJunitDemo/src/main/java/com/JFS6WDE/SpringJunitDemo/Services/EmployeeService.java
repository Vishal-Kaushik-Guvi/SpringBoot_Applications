package com.JFS6WDE.SpringJunitDemo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JFS6WDE.SpringJunitDemo.Entity.Employee;
import com.JFS6WDE.SpringJunitDemo.Repository.EmployeeRepository;

@Service
public class EmployeeService {

@Autowired
private EmployeeRepository empRepo;

public List<Employee> findAllEmployee(){
    return empRepo.findAll();
}

public Employee findEmployeeById(int id){
    return empRepo.findById(id).get();
}

public Employee savEmployeeData(Employee emp){
   return empRepo.save(emp);
}
}
