package com.stechlabs.BankRestAPIs.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity(name = "email_tracking")
public class Email_Tracking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int email_track_id;

    private String sent_email_id;
    private String rec_email_id;

    private boolean isRead;

    @ManyToOne
    @JoinColumn(name = "email_id",nullable = false)
    private Email email;

    @ManyToMany(mappedBy = "email_tracking",cascade = CascadeType.ALL)
    private Set<Employee> employees;

    public Email_Tracking(){}

    public Email_Tracking(int email_track_id, String sent_email_id, String rec_email_id, boolean isRead, Email email, Set<Employee> employees) {
        this.email_track_id = email_track_id;
        this.sent_email_id = sent_email_id;
        this.rec_email_id = rec_email_id;
        this.isRead = isRead;
        this.email = email;
        this.employees = employees;
    }

    public int getEmail_track_id() {
        return email_track_id;
    }

    public void setEmail_track_id(int email_track_id) {
        this.email_track_id = email_track_id;
    }

    public String getSent_email_id() {
        return sent_email_id;
    }

    public void setSent_email_id(String sent_email_id) {
        this.sent_email_id = sent_email_id;
    }

    public String getRec_email_id() {
        return rec_email_id;
    }

    public void setRec_email_id(String rec_email_id) {
        this.rec_email_id = rec_email_id;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }


    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

}

