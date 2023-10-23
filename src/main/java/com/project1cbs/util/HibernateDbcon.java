package com.project1cbs.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDbcon {
  public static SessionFactory getSessionFactory() {
	  SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	return sessionFactory;
  }
}
