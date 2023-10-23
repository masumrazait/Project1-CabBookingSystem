package com.project1cbs.test;

import com.project1cbs.dao.GetUserCredentialsDao;
import com.project1cbs.dao.GetUserCredentialsDaoImpl;
import com.project1cbs.model.Employee;
import com.project1cbs.service.AddEmployee;
import com.project1cbs.service.AddEmployeeImpl;

import junit.framework.TestCase;

public class TestAddEmployeeDaoImpl extends TestCase {

	public void testAddEmployeeDao() {
		//String name, String email, String managerOrNot, String dept
		Employee emp = new Employee("Manu","manu@gmail.com","employee","BBC");
		AddEmployee addEmp = new AddEmployeeImpl();
		addEmp.addEmployee(emp);
		GetUserCredentialsDao uDao = new GetUserCredentialsDaoImpl();
		assertEquals("manu@gmail.com",uDao.getEmail(6) );
	}

}
