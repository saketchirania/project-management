package com.jrp.pma.controllers;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.entities.Employee;
import com.jrp.pma.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository proReop;

    @Autowired
    EmployeeRepository empRepo;

    @GetMapping
    public String displayProjects(Model model)
    {
        List<Project> projectList = proReop.findAll();
        model.addAttribute("projects",projectList);
        return "projects/list-projects";
    }

    @GetMapping("/new")
    public String displayProjectForm(Model model){
        Project aProject = new Project();
        model.addAttribute("project", aProject);
        List<Employee> employeeList= empRepo.findAll();
        model.addAttribute("project", aProject);
        model.addAttribute("allEmployees", employeeList);
        return "projects/new-project";
    }

    @PostMapping("/save")
    public String createProject(Project project, @RequestParam List <Long> employees, Model model){
        // use a redirect to prevent duplicate submission
        proReop.save(project);
        return "redirect:/projects ";
    }

}
