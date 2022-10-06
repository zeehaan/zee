package com.stechlabs.BankRestAPIs.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int person_id;
    private String fname;
    private String lname;
    private String age;
    private String address;
    private String email_address;
    private String phone_number;
    private String mobile_number;

    @JsonIgnore
    @OneToOne(mappedBy = "person",cascade = CascadeType.MERGE)
    private Customer customer;

    @OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
    private Employee employee;



    public Person(){}

    public Person(int person_id, String fname, String lname, String age, String address, String email_address, String phone_number, String mobile_number, Customer customer, Employee employee) {
        this.person_id = person_id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.address = address;
        this.email_address = email_address;
        this.phone_number = phone_number;
        this.mobile_number = mobile_number;
        this.customer = customer;
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }
}
