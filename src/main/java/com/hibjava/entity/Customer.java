package com.hibjava.entity;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "customer") 
public class Customer { 
	@Id
	private Integer cId;
	
	
	@Column
	private String cName;
	@Column
	private String city;
	@Column
	private Date dob;
	
	public Customer() {
		
	}
	
	public Customer(Integer cId, String cName, String city, Date dob) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.city = city;
		this.dob = dob;
	}
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {return "Customer [cId=" + cId + ", cName=" + cName + ", city=" + city + ", dob=" + dob + "]";
	}
	

}

