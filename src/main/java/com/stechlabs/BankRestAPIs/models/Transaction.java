package com.stechlabs.BankRestAPIs.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "transaction")
public class Transaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transaction_id;
    private Date transaction_date = new Date();
    private Character debit_credit;

    @OneToOne
    @JoinColumn(name = "loan_fk")
    private Loans loan;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "transaction_type_id",nullable = false)
    private Transaction_type transaction_type;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "employee_id",nullable = false)
    private Employee employee;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "account_id")
    private Account account;

    public Transaction(){}

    public Transaction(int transaction_id, Date transaction_date, Character debit_credit, Loans loan, Transaction_type transaction_type, Employee employee, Account account) {
        this.transaction_id = transaction_id;
        this.transaction_date = transaction_date;
        this.debit_credit = debit_credit;
        this.loan = loan;
        this.transaction_type = transaction_type;
        this.employee = employee;
        this.account = account;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccounts(Account account) {
        this.account = account;
    }


    public Loans getLoan() {
        return loan;
    }

    public void setLoan(Loans loan) {
        this.loan = loan;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Character getDebit_credit() {
        return debit_credit;
    }

    public void setDebit_credit(Character debit_credit) {
        this.debit_credit = debit_credit;
    }

    public Transaction_type getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(Transaction_type transaction_type) {
        this.transaction_type = transaction_type;
    }
}
