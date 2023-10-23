package com.project1cbs.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.project1cbs.model.BookingResult;
import com.project1cbs.util.HibernateDbcon;

public class GetBookingResultsDaoImpl implements GetBookingResults{

	public List<BookingResult> getBookingResult() {
		Session session = HibernateDbcon.getSessionFactory().openSession();
		String query = "from BookingResult";
		Query q = session.createQuery(query);
		
		@SuppressWarnings("unchecked")
		List<BookingResult> bResult = q.getResultList();
		return bResult;
	}

}
