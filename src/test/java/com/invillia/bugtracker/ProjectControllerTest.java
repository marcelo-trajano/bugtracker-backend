package com.invillia.bugtracker;

import com.invillia.bugtracker.controller.ProjectController;
import com.invillia.bugtracker.repository.ProjectRepository;
import com.invillia.bugtracker.service.ProjectService;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;

import static org.mockito.Mockito.verify;

//@ExtendWith(SpringExtension.class)
//@WebMvcTest(ProjectController.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ProjectControllerTest {

    @InjectMocks
    ProjectService service;
    @Mock
    ProjectRepository repository;


    @Test
    public void findByIdTest(){
        // service.getProject(new Long(15));
        // verify(repository.findAllById(Collections.singleton(new Long(15))));
    }

}
