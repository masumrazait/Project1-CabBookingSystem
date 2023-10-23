package com.project1cbs.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.project1cbs.model.Cab;
import com.project1cbs.util.HibernateDbcon;

@SuppressWarnings("deprecation")
public class GetFreeCabsDaoImpl implements GetFreeCabsDao{

   
	@SuppressWarnings("unchecked")
	public List<Cab> getFreeCabs() {
		Session session = HibernateDbcon.getSessionFactory().openSession();
		List<Cab> freeCabs = new ArrayList<Cab>();
		String query = "from Cab where bookingStatus = 0";
		@SuppressWarnings("rawtypes")
		Query q = session.createQuery(query);
		
		freeCabs = q.list();
		
		session.close();
		return freeCabs;
	}

}
