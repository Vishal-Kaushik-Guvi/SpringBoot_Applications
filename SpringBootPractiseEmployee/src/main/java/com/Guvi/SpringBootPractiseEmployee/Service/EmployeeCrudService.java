package com.Guvi.SpringBootPractiseEmployee.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.Guvi.SpringBootPractiseEmployee.Entity.Employee;

public interface EmployeeCrudService {

List<Employee> getAllEmplopyees();

Employee getEmployeeById(int id);

void saveEmployeedata(Employee emp);

void deleteEmployee(int id);

// Pegenation find page no. page size etc..

Page<Employee> findPage(int pageNo, int pageSize, String sortField, String sortDirection);

}