package com.stechlabs.BankRestAPIs.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity(name = "email")
public class Email implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int email_id;
    private String title;
    private String body;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "email")
    private Set<Email_Tracking> email_trackingList;

    public Email(){}

    public Email(int email_id, String title, String body, Set<Email_Tracking> email_trackingList) {
        this.email_id = email_id;
        this.title = title;
        this.body = body;
        this.email_trackingList = email_trackingList;
    }

    public Set<Email_Tracking> getEmail_trackingList() {
        return email_trackingList;
    }

    public void setEmail_trackingList(Set<Email_Tracking> email_trackingList) {
        this.email_trackingList = email_trackingList;
    }

    public int getEmail_id() {
        return email_id;
    }

    public void setEmail_id(int email_id) {
        this.email_id = email_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
