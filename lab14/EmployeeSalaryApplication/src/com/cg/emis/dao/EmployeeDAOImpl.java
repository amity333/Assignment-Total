package com.cg.emis.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.emis.bean.Employee;
import com.cg.emis.exception.EmployeeException;

public class EmployeeDAOImpl implements EmployeeDAO {

	Map<Integer, Employee> employees = new HashMap<>();

	@Override
	public Employee AddEmployee(Employee emp) throws EmployeeException {
		if (emp == null)
			throw new NullPointerException();
		
		employees.put(emp.getEmpid(), emp);
		return emp;
	}

	@Override
	public ArrayList<Employee> getEmployeeList() throws EmployeeException {

		Collection<Employee> cl = employees.values();
		ArrayList<Employee> list = new ArrayList<>(cl);
		return list;
	}

	@Override
	public Employee updateInsuranceScheme(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployee(int empid) throws EmployeeException {
		Employee emp = employees.remove(empid);
		return emp;
	}

	@Override
	public Employee getEmployee(int id) throws EmployeeException {
		Employee emp = employees.get(id);
		return emp;
	}

}
