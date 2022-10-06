package com.stechlabs.BankRestAPIs.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity(name = "account")
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int account_id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "account_type_id",nullable = false)
    private Account_Type account_type;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer;

    private double rate;
    private String status;
    private double balance;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "bank_branch_id",nullable = false)
    private Bank_Branch bank_branch;

    @JsonIgnore
    @OneToMany(mappedBy = "account",cascade = CascadeType.ALL)
    private List<Transaction> transactions;


    public Account(){}
    public Account(int account_id, Account_Type account_type, Customer customer, double rate, String status, double balance, Bank_Branch bank_branch, List<Transaction> transactions) {
        this.account_id = account_id;
        this.account_type = account_type;
        this.customer = customer;
        this.rate = rate;
        this.status = status;
        this.balance = balance;
        this.bank_branch = bank_branch;
        this.transactions = transactions;
    }

    public void setTransaction(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Bank_Branch getBank_branch() {
        return bank_branch;
    }

    public void setBank_branch(Bank_Branch bank_branch) {
        this.bank_branch = bank_branch;
    }

    /*public List<Transaction> getTransaction() {
        return transactions;
    }*/


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public Account_Type getAccount_type() {
        return account_type;
    }

    public void setAccount_type(Account_Type account_type) {
        this.account_type = account_type;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
