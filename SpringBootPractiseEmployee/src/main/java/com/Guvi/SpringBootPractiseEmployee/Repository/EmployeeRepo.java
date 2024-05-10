package com.Guvi.SpringBootPractiseEmployee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Guvi.SpringBootPractiseEmployee.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
