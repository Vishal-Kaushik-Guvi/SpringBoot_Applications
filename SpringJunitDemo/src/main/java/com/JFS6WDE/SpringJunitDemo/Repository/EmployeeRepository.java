package com.JFS6WDE.SpringJunitDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JFS6WDE.SpringJunitDemo.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    
}
