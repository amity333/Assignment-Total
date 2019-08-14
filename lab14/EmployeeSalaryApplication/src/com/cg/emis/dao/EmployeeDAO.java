package com.cg.emis.dao;

import java.util.ArrayList;

import com.cg.emis.bean.Employee;
import com.cg.emis.exception.EmployeeException;

public interface EmployeeDAO {

	public Employee AddEmployee(Employee emp) throws EmployeeException;

	public ArrayList<Employee> getEmployeeList() throws EmployeeException;
	
	public Employee updateInsuranceScheme(int id)throws EmployeeException;

	public Employee deleteEmployee(int empid) throws EmployeeException;
	public Employee getEmployee(int id ) throws EmployeeException;
}
