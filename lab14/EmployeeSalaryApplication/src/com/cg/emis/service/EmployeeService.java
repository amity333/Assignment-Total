package com.cg.emis.service;

import java.util.ArrayList;

import com.cg.emis.bean.Employee;
import com.cg.emis.exception.EmployeeException;

public interface EmployeeService {
	public Employee AddEmployee(Employee emp) throws EmployeeException;

	public ArrayList<Employee> getEmployeeList() throws EmployeeException;
	
	public Employee updateInsuranceScheme(int id)throws EmployeeException;

	public Employee deleteEmployee(int empid) throws EmployeeException;
	
	
}
