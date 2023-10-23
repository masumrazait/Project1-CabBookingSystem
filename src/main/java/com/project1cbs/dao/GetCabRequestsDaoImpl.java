package com.project1cbs.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Query.*;
import org.hibernate.Session;

import com.project1cbs.model.BookingRequests;
import com.project1cbs.util.HibernateDbcon;


@SuppressWarnings("unused")
public class GetCabRequestsDaoImpl{

	@SuppressWarnings("unchecked")
	public List<BookingRequests> getBookingRequests(){
		Session session = HibernateDbcon.getSessionFactory().openSession();
		List<BookingRequests> br = new ArrayList<BookingRequests>();
		
		String query = "from BookingRequests";
		
		Query q = session.createQuery(query);
		
		br = q.getResultList();
		
		session.close();
		return br;
	}
     
	

}
