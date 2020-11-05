package com.invillia.bugtracker.controller;

import com.invillia.bugtracker.model.Bug;
import com.invillia.bugtracker.model.Project;
import com.invillia.bugtracker.service.BugService;
import com.invillia.bugtracker.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/bug")
public class BugController {

    @Autowired
    private BugService bugService;

    @PostMapping("/{idProject}")
    public void save(@RequestBody Bug bug, @PathVariable Long idProject){
        bugService.save(bug, idProject);
    }

    @GetMapping("/{idProject}")
    public List<Bug> getBugsByProjectId(@PathVariable Long idProject){
        return bugService.getBugsByProjectId(idProject);
    }

    @DeleteMapping("/{id}")
    public Long delete(@PathVariable Long id){
        return bugService.delete(id);
    }

}
