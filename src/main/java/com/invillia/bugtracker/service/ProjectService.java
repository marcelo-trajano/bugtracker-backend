package com.invillia.bugtracker.service;

import com.invillia.bugtracker.model.Project;
import com.invillia.bugtracker.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public void save(Project project){
        projectRepository.save(project);
    }

    public List<Project> getAll(){
        return projectRepository.findAll();
    }

    public Project getProject(Long id){
        return projectRepository.findById(id).orElse(null);
    }

    public Project update(Project project){

         Project newProject = projectRepository.findById(project.getId()).orElse(null);
         newProject.setName(project.getName());
         projectRepository.save(newProject);

        return newProject;
    }

    public Long delete(Long id){
        projectRepository.deleteById(id);
        return id;
    }




}
