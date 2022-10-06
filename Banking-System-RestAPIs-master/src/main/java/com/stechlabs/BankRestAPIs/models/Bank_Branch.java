package com.stechlabs.BankRestAPIs.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity(name = "bank_branch")
public class Bank_Branch implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int branch_id;
    private String branch_name;
    private String country;
    private String city;
    private String phone;
    private String bank_name;


    @OneToMany(mappedBy = "branch")
    @JsonIgnore
    private List<Employee> employees;

    @JsonIgnore
    @OneToMany(mappedBy = "bank_branch",fetch = FetchType.LAZY)
    private List<Account> accounts;


    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }



    public Bank_Branch(){}

    public Bank_Branch(int branch_id, String branch_name, String country, String city, String phone, String bank_name, List<Employee> employees, List<Account> accounts) {
        this.branch_id = branch_id;
        this.branch_name = branch_name;
        this.country = country;
        this.city = city;
        this.phone = phone;
        this.bank_name = bank_name;
        this.employees = employees;
        this.accounts = accounts;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
