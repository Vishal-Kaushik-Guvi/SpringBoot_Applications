package com.JFS6WDE.SpringJunitDemo.Services;

import java.util.List;
import java.util.Optional;

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

public Optional< Employee > findEmployeeById(int id){
    return empRepo.findById(id);
}

public Employee saveEmployeeData(Employee emp){
   return empRepo.save(emp);
}

public String deleteEmployeeByid(int id){
      empRepo.deleteById(id);
      return "Employee with " + id + "Deleted";
}
}
