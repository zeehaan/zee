package com.stechlabs.BankRestAPIs.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.engine.internal.Cascade;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity(name = "employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;
    private double salary;
    private double hourly_rate;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id",nullable = false)
    private Person person;

    @JsonIgnore
    @OneToMany(mappedBy = "transaction_type")
    private List<Transaction> transactionList;


    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "bank_branch_id",nullable = false)
    private Bank_Branch branch;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "department_id",nullable = false)
    private Department department;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "employee_email_tracking",
            joinColumns = {
                    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "email_track_id", referencedColumnName = "email_track_id",
                            nullable = false, updatable = false)})
    private List<Email_Tracking> email_tracking=new ArrayList<>();

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "job_title_id",nullable = false)
    private Job_Title job_title;


    public Employee() {}

    public Employee(int employee_id, double salary, double hourly_rate, String password, Person person, List<Transaction> transactionList, Bank_Branch branch, Department department, List<Email_Tracking> email_tracking, Job_Title job_title) {
        this.employee_id = employee_id;
        this.salary = salary;
        this.hourly_rate = hourly_rate;
        this.password = password;
        this.person = person;
        this.transactionList = transactionList;
        this.branch = branch;
        this.department = department;
        this.email_tracking = email_tracking;
        this.job_title = job_title;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public Bank_Branch getBranch() {
        return branch;
    }

    public void setBranch(Bank_Branch branch) {
        this.branch = branch;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Email_Tracking> getEmail_tracking() {
        return email_tracking;
    }

    public void setEmail_tracking(List<Email_Tracking> email_tracking) {
        this.email_tracking = email_tracking;
    }

    public Job_Title getJob_title() {
        return job_title;
    }

    public void setJob_title(Job_Title job_title) {
        this.job_title = job_title;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }


    public List<Email_Tracking> getEmail_trackings() {
        return email_tracking;
    }

    public void setEmail_trackings(List<Email_Tracking> email_trackings) {
        this.email_tracking = email_trackings;
    }
}
