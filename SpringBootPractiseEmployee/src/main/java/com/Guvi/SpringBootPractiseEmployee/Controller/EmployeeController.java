package com.Guvi.SpringBootPractiseEmployee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Guvi.SpringBootPractiseEmployee.Entity.Employee;
import com.Guvi.SpringBootPractiseEmployee.Service.EmployeeCrudService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeCrudService empService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        // Function is made at last of all mapping in this controller
        return findPagenated(1, "sort", "asc", model);
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        empService.saveEmployeedata(employee);
        return "redirect:/";
    }

    @GetMapping("/newEmployee")
    public String showNewEmployee(Model model){
        Employee emp = new Employee();
        model.addAttribute("emp", emp);
        return "newemployee";
    }
      
    @DeleteMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("id") int id ){
        empService.deleteEmployee(id);
        return "redirect:/";
    }

    
    @GetMapping("/page/{pageNo}")
    public String findPagenated(@PathVariable(value = "pageNo") int pageNo,
            @RequestParam(value = "sortField") String sortField,
            @RequestParam(value = "sortDirection") String sortDirection, Model model) {
        int pageSize = 5;
        Page<Employee> empPage = empService.findPage(pageNo, pageSize, sortField, sortDirection);
        List<Employee> pageContent = empPage.getContent();

        model.addAttribute("pageContent", pageContent);
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDirection", sortDirection);
        model.addAttribute("reverseSort", sortDirection.equals("asc") ? "desc" : "asc");
        model.addAttribute("currentPage", pageNo);

        model.addAttribute("totalPages", empPage.getTotalPages());
        model.addAttribute("totalPageElement", empPage.getTotalElements());

        return "index";
    }

}
