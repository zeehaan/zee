package com.stechlabs.BankRestAPIs.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity(name = "job_title")
public class Job_Title implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int job_title_id;
    private String title;
    private String description;

    @OneToMany(mappedBy = "job_title")
    private List<Employee> employees;

    public Job_Title(){}

    public Job_Title(int job_title_id, String title, String description, List<Employee> employees) {
        this.job_title_id = job_title_id;
        this.title = title;
        this.description = description;
        this.employees = employees;
    }

    public int getJob_title_id() {
        return job_title_id;
    }

    public void setJob_title_id(int job_title_id) {
        this.job_title_id = job_title_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
