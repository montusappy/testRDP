package com.cognizant.ams.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @Column(name = "Contact_id")
    private String Contact_id;
    @Column(name = "C_contact_no")
    private String C_contact_no;
    @Column(name = "C_Type")
    private String contactType;
    @ManyToOne
    @JoinColumn(name = "Agent_id", nullable = false)
    private Agent agent;

    public void setContact_id(String contact_id) {
        Contact_id = contact_id;
    }

    public String getC_contact_no() {
        return C_contact_no;
    }

    public void setC_contact_no(String c_contact_no) {
        C_contact_no = c_contact_no;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

}
