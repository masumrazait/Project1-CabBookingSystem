package com.project1cbs.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BookingResult {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer bookResultId;


@OneToOne(cascade=CascadeType.ALL,targetEntity=BookingRequests.class)
@JoinColumn(name="bookingId")
private BookingRequests brId;


private String status;

public BookingResult( BookingRequests brId, String status) {
	super();
	this.bookResultId=1;
	this.brId = brId;

	this.status = status;
}

public Integer getBookResultId() {
	return bookResultId;
}

public void setBookResultId(Integer bookResultId) {
	this.bookResultId = bookResultId;
}

public BookingRequests getBrId() {
	return brId;
}

public void setBrId(BookingRequests brId) {
	this.brId = brId;
}



public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public BookingResult() {
	super();
	// TODO Auto-generated constructor stub
}


 

}
