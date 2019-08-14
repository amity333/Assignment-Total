package com.cg.emis.service;

import java.util.ArrayList;

import com.cg.emis.bean.Employee;
import com.cg.emis.dao.EmployeeDAO;
import com.cg.emis.dao.EmployeeDAOImpl;
import com.cg.emis.exception.EmployeeException;

public class EmployeeServiceImpl  implements EmployeeService{

	EmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao= new EmployeeDAOImpl();
	}
	
	@Override
	public Employee AddEmployee(Employee emp) throws EmployeeException {
	
		emp=dao.AddEmployee(emp);
		return emp;
	}

	@Override
	public ArrayList<Employee> getEmployeeList() throws EmployeeException {
		return dao.getEmployeeList();
	}

	@Override
	public Employee updateInsuranceScheme(int id) throws EmployeeException {
		Employee emp= dao.getEmployee(id);
		if(emp==null)
			throw new EmployeeException("Empid not Found");
		
		double sal= emp.getSalary();
		String des= emp.getDesignation();
		
		if(sal > 5000 && sal<=20000 && des.equals("System Associate"))
			emp.setInsuranceScheme("Scheme C");
		else if (sal>=20000 && sal<=40000 && des.equals("Programmer"))
			emp.setInsuranceScheme("Scheme B");
		else if (sal>40000 && des.equals("Manager"))
			emp.setInsuranceScheme("Scheme A");
		else if( sal <5000 && des.equals("Clerk"))
				emp.setInsuranceScheme("No Scheme");
		else 
			emp.setInsuranceScheme("NA");
	
		dao.AddEmployee(emp);
		return emp;
	}

	@Override
	public Employee deleteEmployee(int empid) throws EmployeeException {
		Employee emp= dao.deleteEmployee(empid);
		if(emp== null)
			throw new EmployeeException("Empid does not exist");
		else
			return emp;
	}
	

}
