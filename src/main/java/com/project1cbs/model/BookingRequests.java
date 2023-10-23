package com.project1cbs.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BookingRequests {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer bId;
   

	@OneToOne(cascade=CascadeType.ALL,targetEntity=Cab.class)
	@JoinColumn(name="cabId")
	private Cab cab;
	
	@OneToOne(cascade=CascadeType.ALL,targetEntity=Employee.class)
	@JoinColumn(name="empId")
	private Employee emp;
	
	private Integer checkedOrNot;//0 for not checked 1 for checked

	public Integer getCheckedOrNot() {
		return checkedOrNot;
	}

	public void setCheckedOrNot(Integer checkedOrNot) {
		this.checkedOrNot = checkedOrNot;
	}

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public BookingRequests() {
		super();
		 this.checkedOrNot = 0;//not checked by default
		// TODO Auto-generated constructor stub
	}

	public BookingRequests( Cab cab, Employee emp) {
		super();
	    this.checkedOrNot = 0;//not checked by default
		this.cab = cab;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Booking [bId=" + bId + ", cabNo=" + cab + ", emp=" + emp + "]";
	}
	

}
