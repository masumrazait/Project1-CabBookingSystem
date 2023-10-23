package com.project1cbs.test;
import com.project1cbs.dao.GetUserCredentialsDao;
import com.project1cbs.dao.GetUserCredentialsDaoImpl;
import com.project1cbs.model.Employee;

import junit.framework.TestCase;

public class TestGetUserCredentialsDaoImpl extends TestCase {
    
	GetUserCredentialsDao dao = new GetUserCredentialsDaoImpl();
	
	public void testGetEmail() {
		String empEmail = "suman@gmail.com";
		
		assertEquals(empEmail, dao.getEmail(2));
	}

	public void testGetPassword() {
		String empPwd = "Suman123";
		assertEquals(empPwd, dao.getPassword(2));
	}

	public void testGetDesignation() {
		String empDesig = "employee";
		assertEquals(empDesig, dao.getDesignation(2));
	}

	public void testGetEmpObj() {
		Employee emp = new Employee();
		emp.setActive(true);
		emp.setDept("CCC");
		emp.setEmail("suman@gmail.com");
		emp.setEmpId(2);
		emp.setManagerOrNot("employee");
		emp.setName("Suman");
		assertEquals(emp.getEmail(), dao.getEmpObj(2).getEmail());
		assertEquals(emp.getDept(), dao.getEmpObj(2).getDept());
		
//		assertEquals(emp.getPassword(), dao.getEmpObj(2).getPassword());
		assertEquals(emp.getManagerOrNot(), dao.getEmpObj(2).getManagerOrNot());
	}

}
