package com.cognizant.ams.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="agent")
public class Agent {

	@Id
	@Column(name="Agent_id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String agenntId;
	@Column(name="A_name")
	private String name;
	@Column(name="A_dob")
	private String dob;
	@Column(name="A_c_address")
	private String address;
	@Column(name="A_email")
	private String email;
	@Column(name="A_city")
	private String city;
	@Column(name="A_state")
	private String state;
	@Column(name="A_country")
	private String country;
	@Column(name="A_pincode")
	private String pincode;
	@Column(name="A_DOJ")
	private String DOJ;
	@Column(name="A_type")
	private String type;
	@Column(name="agent_user_id")
	private String agent_user_id;
	@Column(name="A_password")
	private String password;
	
	@OneToMany
	List<Contact> contactList=new ArrayList<Contact>();
	
	public String getAgenntId() {
		return agenntId;
	}

	public List<Contact> getContactList() {
		if(contactList == null){
			contactList = new ArrayList<Contact>();
		}
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	public void setAgenntId(String agenntId) {
		this.agenntId = agenntId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAgent_user_id() {
		return agent_user_id;
	}

	public void setAgent_user_id(String agent_user_id) {
		this.agent_user_id = agent_user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
