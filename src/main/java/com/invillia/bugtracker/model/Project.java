package com.invillia.bugtracker.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    //@OneToMany(mappedBy = "project")
    private Set<Bug> bug;

    public Set<Bug> getBug() {
        return bug;
    }

    public void setBug(Set<Bug> bug) {
        this.bug = bug;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
