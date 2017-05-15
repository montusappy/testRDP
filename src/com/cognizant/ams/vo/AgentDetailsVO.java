package com.cognizant.ams.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class AgentDetailsVO {

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 20)
    private String name;
    @NotNull
    @NotEmpty
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    @Size(min = 1, max = 10)
    private String dob;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 10)
    private String pc;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 10)
    private String ac;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 100)
    private String address;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 20)
    private String email;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 10)
    private String state;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 10)
    private String city;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 10)
    private String country;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 7)
    private String pin;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 10)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private String doj;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 10)
    private String jobType;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

}
