package com.invillia.bugtracker.service;

import com.invillia.bugtracker.model.Bug;
import com.invillia.bugtracker.model.Project;
import com.invillia.bugtracker.repository.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BugService {

    @Autowired
    BugRepository bugRepository;

    @Autowired
    private ProjectService projectService;

    public void save(Bug bug, Long idProject){
        Project project = projectService.getProject(idProject);
        bug.setProject(project);
        bugRepository.save(bug);
    }

    public List<Bug> getBugsByProjectId(Long idProject){
        return bugRepository.findBugsByProject(idProject);
    }

    public Long delete(Long id){
        bugRepository.deleteById(id);
        return id;
    }

}
