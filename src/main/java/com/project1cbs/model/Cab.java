package com.project1cbs.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "Cabs")
public class Cab {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer cabId;
     private String cabModel;
     private String driverName;
     private String drivMobNo;
     private Integer bookingStatus;//0 for open 1 for closed
     
    
   
	public Cab() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Cab [cabId=" + cabId + ", cabModel=" + cabModel + ", driverName=" + driverName + ", drivMobNo="
				+ drivMobNo + ", bookingStatus=" + bookingStatus + "]";
	}
	public Cab(Integer bookingStatus, String driverName, String drivMobNo, String cabModel) {
		super();
		
		this.bookingStatus = bookingStatus;
		this.driverName = driverName;
		this.drivMobNo = drivMobNo;
		this.cabModel = cabModel;
	}
	public Integer getCabId() {
		return cabId;
	}
	public void setCabId(Integer cabId) {
		this.cabId = cabId;
	}
	public Integer getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(Integer bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDrivMobNo() {
		return drivMobNo;
	}
	public void setDrivMobNo(String drivMobNo) {
		this.drivMobNo = drivMobNo;
	}
	public String getCabModel() {
		return cabModel;
	}
	public void setCabModel(String cabModel) {
		this.cabModel = cabModel;
	}
     
     
}
