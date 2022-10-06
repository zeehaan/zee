package com.stechlabs.BankRestAPIs.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "loan")
public class Loans implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loan_id;
    private double duration_in_months;
    private double interest_rate;
    private Date start_date;

    @OneToOne(mappedBy = "loan")
    private Transaction transaction;

    public Loans(){}

    public Loans(int loan_id, double duration_in_months, double interest_rate, Date start_date, Transaction transaction) {
        this.loan_id = loan_id;
        this.duration_in_months = duration_in_months;
        this.interest_rate = interest_rate;
        this.start_date = start_date;
        this.transaction = transaction;
    }

    public int getLoan_id() {
        return loan_id;
    }

    public void setLoan_id(int loan_id) {
        this.loan_id = loan_id;
    }

    public double getDuration_in_months() {
        return duration_in_months;
    }

    public void setDuration_in_months(double duration_in_months) {
        this.duration_in_months = duration_in_months;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }
}
