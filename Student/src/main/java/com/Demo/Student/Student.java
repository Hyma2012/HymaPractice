package com.Demo.Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="ID")
	int ID;
	
	@Column(name="SName")
	String SName;
	
	@Column(name="Course")
	String Course;
	
	@Column(name="Address")
	String Address;
	
	@Column(name="City")
	String City;

	public Student() {
		super();
		
	}

	public int getID() {
		return ID;
	}

	public String getSName() {
		return SName;
	}

	public String getCourse() {
		return Course;
	}

	public String getAddress() {
		return Address;
	}

	public String getCity() {
		return City;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setCity(String city) {
		City = city;
	}
	

}
