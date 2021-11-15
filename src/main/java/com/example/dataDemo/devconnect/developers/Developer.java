package com.example.dataDemo.devconnect.developers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private Integer cohort;
    private String github;

    public Developer() {}

    public Developer(String name, String email, String github, Integer cohort) {
        this.name = name;
        this.email = email;
        this.cohort = cohort;
        this.github = github;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId(String github) {
        this.github = github;
    }

    public String getName() {
        return name;
    }

    public String getGithub() {
        return github;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCohort() {
        return cohort;
    }

    public void setCohort(Integer cohort) {
        this.cohort = cohort;
    }
}