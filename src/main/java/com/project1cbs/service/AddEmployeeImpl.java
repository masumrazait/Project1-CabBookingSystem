package com.project1cbs.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.project1cbs.dao.AddEmployeeDao;
import com.project1cbs.dao.AddEmployeeDaoImpl;
import com.project1cbs.model.Employee;

public class AddEmployeeImpl implements AddEmployee{
    public static final Logger logger = LogManager.getLogger(AddEmployeeImpl.class);

     AddEmployeeDao dao = new AddEmployeeDaoImpl();
	public Boolean addEmployee(Employee employee) {
		logger.info("In add employee service page...");
		dao.addEmployeeDao(employee);//calling the add function from dao layer
		return true;
	}

}
