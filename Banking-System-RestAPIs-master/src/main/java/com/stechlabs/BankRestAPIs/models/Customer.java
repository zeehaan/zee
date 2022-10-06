package com.stechlabs.BankRestAPIs.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;
    private String customer_type;

    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_fk",nullable = false)
    private Person person;

    @JsonIgnore
    @OneToMany(mappedBy = "customer")
    private List<Account> accounts;


    public Customer(){}


    public Customer(int customer_id, String customer_type, Person person,String password,List<Account> accounts) {
        this.customer_id = customer_id;
        this.customer_type = customer_type;
        this.person = person;
        this.accounts = accounts;
        this.password=password;
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

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }


    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }
}
