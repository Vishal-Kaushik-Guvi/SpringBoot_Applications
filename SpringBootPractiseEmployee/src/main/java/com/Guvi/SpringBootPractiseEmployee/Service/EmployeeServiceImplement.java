package com.Guvi.SpringBootPractiseEmployee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Guvi.SpringBootPractiseEmployee.Entity.Employee;
import com.Guvi.SpringBootPractiseEmployee.Repository.EmployeeRepo;

@Service
public class EmployeeServiceImplement implements EmployeeCrudService {

     @Autowired
     private EmployeeRepo empRepo;

     @Override
     public List<Employee> getAllEmplopyees() {
          return empRepo.findAll();
     }

     @Override
     public Employee getEmployeeById(int id) {
          return empRepo.findById(id).get();
     }

     @Override
     public void saveEmployeedata(Employee emp) {
          empRepo.save(emp);
     }

     @Override
     public void deleteEmployee(int id) {
          empRepo.deleteById(id);
     }

     @Override
     public Page<Employee> findPage(int pageNo, int pageSize, String sortField, String sortDirection) {
          Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name())
          ?Sort.by(sortField).ascending():Sort.by(sortField).descending();
                                      // : means else
          Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
          
          return empRepo.findAll(pageable);
     }

}
