package com.project1cbs.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.project1cbs.model.Employee;
import com.project1cbs.util.HibernateDbcon;

public class AddEmployeeDaoImpl implements AddEmployeeDao{
	 public static final Logger logger = LogManager.getLogger(AddEmployeeDaoImpl.class);

    public void addEmployeeDao(Employee employee) {
		logger.info("In add employee function...");

		Session session = HibernateDbcon.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		
		session.save(employee);
		
		tx.commit();
		session.close();
		logger.info("Add employee function executed successfully....");

	}

}
