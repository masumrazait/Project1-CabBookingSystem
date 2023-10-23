package com.project1cbs.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	private String name;
	private String email;
	private String managerOrNot;
	private Boolean active;
	private String dept;
	private String password;
	
	
	
	
	public Employee(String name, String email, String managerOrNot, String dept) {
		super();
		
		this.name = name;
		this.email = email;
		this.managerOrNot = managerOrNot;
		this.active = true;
		this.dept = dept;
		this.password = name + "123";
	}
	
	
	

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getManagerOrNot() {
		return managerOrNot;
	}
	public void setManagerOrNot(String managerOrNot) {
		this.managerOrNot = managerOrNot;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", managerOrNot=" + managerOrNot
				+ ", active=" + active + ", dept=" + dept + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getPassword() {
		return password;
	}
	
	
	

}
