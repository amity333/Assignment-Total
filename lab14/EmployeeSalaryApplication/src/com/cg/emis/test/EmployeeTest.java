package com.cg.emis.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.emis.dao.EmployeeDAO;
import com.cg.emis.dao.EmployeeDAOImpl;
import com.cg.emis.exception.EmployeeException;
import com.cg.emis.service.EmployeeValidator;

public class EmployeeTest {

	
	@Test
	public void testMethod1() {
		
		EmployeeValidator validator= new EmployeeValidator();
		
		String empid="923404";
		boolean actual= validator.validateEmpId(empid);
		boolean expected=true;
		
		assertEquals(expected, actual);
	}
	@Test
	public void testMethod2() {
		
		EmployeeValidator validator= new EmployeeValidator();
		
		String empid="92340423";
		boolean actual= validator.validateEmpId(empid);
		boolean expected=false;
		assertEquals(expected, actual);
	}
	@Test
	public void testMethod3() {
		
		EmployeeValidator validator= new EmployeeValidator();
		
		String empid="ertr34";
		boolean actual= validator.validateEmpId(empid);
		boolean expected=false;
		assertEquals(expected, actual);
	}
	
	@Test(expected=NullPointerException.class)
	public void testMethod4() {
		
		EmployeeValidator validator= new EmployeeValidator();
		
		String empid=null;
		boolean actual= validator.validateEmpId(empid);
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testMethod5() {
		
		EmployeeDAO dao= new EmployeeDAOImpl();
		try {
			dao.AddEmployee(null);
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
