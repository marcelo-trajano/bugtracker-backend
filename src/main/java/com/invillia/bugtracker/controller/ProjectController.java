package com.invillia.bugtracker.controller;

import com.invillia.bugtracker.model.Project;
import com.invillia.bugtracker.service.BugService;
import com.invillia.bugtracker.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/")
    public void save(@RequestBody Project project){
        projectService.save(project);
    }

    @GetMapping("/")
    public List<Project> getAll(){
        return projectService.getAll();
    }

    @GetMapping("/{id}")
    public Project getProject(@PathVariable Long id){
        return projectService.getProject(id);
    }

    @PutMapping("/")
    public Project update(@RequestBody Project project){
        return projectService.update(project);
    }

    @DeleteMapping("/{id}")
    public Long delete(@PathVariable Long id){
        return projectService.delete(id);
    }


}
