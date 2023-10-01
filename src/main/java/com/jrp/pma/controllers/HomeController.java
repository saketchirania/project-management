package com.jrp.pma.controllers;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.dto.EmployeeProject;
import com.jrp.pma.entities.Employee;
import com.jrp.pma.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("/")
    public String displayHome(Model model)
    {
        // we are querying the database for projects
        List<Project> project = projectRepository.findAll();
        model.addAttribute("projects",project );

        // we are querying the database for employess
        List<EmployeeProject> employeesProjectCnt = employeeRepository.employeeProjects();
        model.addAttribute("employeesListProjectsCnt",employeesProjectCnt);
        return "main/home.html";
    }


}
