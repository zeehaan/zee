package com.stechlabs.BankRestAPIs.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "transaction_type")
public class Transaction_type implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transaction_type_id;
    private String transaction_name;

    @JsonIgnore
    @OneToMany(mappedBy = "transaction_type")
    private List<Transaction> transactionList;

    private String description;

    public Transaction_type(){}

    public Transaction_type(int transaction_type_id, String transaction_name, List<Transaction> transactionList, String description) {
        this.transaction_type_id = transaction_type_id;
        this.transaction_name = transaction_name;
        this.transactionList = transactionList;
        this.description = description;
    }

    public int getTransaction_type_id() {
        return transaction_type_id;
    }

    public void setTransaction_type_id(int transaction_type_id) {
        this.transaction_type_id = transaction_type_id;
    }

    public String getTransaction_name() {
        return transaction_name;
    }

    public void setTransaction_name(String transaction_name) {
        this.transaction_name = transaction_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}


