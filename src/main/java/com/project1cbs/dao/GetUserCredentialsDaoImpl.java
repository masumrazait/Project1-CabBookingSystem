package com.project1cbs.dao;

import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.engine.query;
import com.project1cbs.model.Employee;
import com.project1cbs.util.HibernateDbcon;

public class GetUserCredentialsDaoImpl implements GetUserCredentialsDao{
	 public static final Logger logger = LogManager.getLogger(GetUserCredentialsDaoImpl.class);

	
	public String getEmail(Integer id) {
		SessionFactory sessionFactory = HibernateDbcon.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		Employee employee = session.get(Employee.class, id);
		
		String email = employee.getEmail();
		
		session.close();
		sessionFactory.close();
		return email;
	}

	
	public String getPassword(Integer id) {
		SessionFactory sessionFactory = HibernateDbcon.getSessionFactory();
		Session session = sessionFactory.openSession();
	
		Employee employee = session.get(Employee.class, id);
		
		String password = employee.getPassword();
		
		session.close();
		sessionFactory.close();
		return password;
	}

	public String getDesignation(Integer id) {
		logger.info("In getDesignation function...");

		SessionFactory sessionFactory = HibernateDbcon.getSessionFactory();
		Session session = sessionFactory.openSession();
		String query = "from Employee where empId =:x";
		
		
		Query q = session.createQuery(query);
		q.setParameter("x", id);
		Employee employee = (Employee)( q.getSingleResult());
		
		String designation = employee.getManagerOrNot();
		
		session.close();
		sessionFactory.close();
		logger.info("getDesignation function executed successfully...");

		return designation;
	}

	
	public Employee getEmpObj(Integer id) {
		logger.info("In getEmpObj function....");
		SessionFactory sessionFactory = HibernateDbcon.getSessionFactory();
		Session session = sessionFactory.openSession();
	
		Employee employee = session.get(Employee.class, id);
		
		session.close();
		sessionFactory.close();
		logger.info("getEmpObj function executed successfully....");

		return employee;
	}

}
