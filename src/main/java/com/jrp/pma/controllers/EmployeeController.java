package com.jrp.pma.controllers;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("/new")
    public String displayEmployeeForm(Model model){

        Employee anEmployee = new Employee();
        model.addAttribute("employee", anEmployee);
        return "new-employee.html";
    }

    @PostMapping("/save")
    public String createEmployee(Employee employee,Model model){
        //save to database
        employeeRepository.save(employee);
        // use a redirect to prevent duplicate submission
        return "redirect:/employees/new";
    }
}
