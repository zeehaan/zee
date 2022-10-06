package com.stechlabs.BankRestAPIs.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity(name = "account_type")
public class Account_Type implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int type_id;
    private String type_name;
    private String description;
    private double rate_range;


    @JsonIgnore
    @OneToMany(mappedBy = "account_type")
    private List<Account> accounts;


    public Account_Type(){}

    public Account_Type(int type_id, String type_name, String description, double rate_range, List<Account> accounts) {
        this.type_id = type_id;
        this.type_name = type_name;
        this.description = description;
        this.rate_range = rate_range;
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate_range() {
        return rate_range;
    }

    public void setRate_range(double rate_range) {
        this.rate_range = rate_range;
    }
}
