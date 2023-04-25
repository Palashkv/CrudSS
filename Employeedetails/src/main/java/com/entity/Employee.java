package com.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eid;
    

	private String first_Name;
	
    private String last_Name;
	
    private String email;
    
  

	public Integer getEid() {
		return eid;
	}



	public void setEid(Integer eid) {
		this.eid = eid;
	}



	public String getFirst_Name() {
		return first_Name;
	}



	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}



	public String getLast_Name() {
		return last_Name;
	}



	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	private Integer age;
}






