package com.cg.emis.pl;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.cg.emis.bean.Employee;
import com.cg.emis.exception.EmployeeException;
import com.cg.emis.service.EmployeeService;
import com.cg.emis.service.EmployeeServiceImpl;
import com.cg.emis.service.EmployeeValidator;

public class Main {
	public static void main(String[] args) {
	
		String id;
		Scanner sc= new Scanner(System.in);
		EmployeeService service=new EmployeeServiceImpl();
		int option; 
		EmployeeValidator validator= new EmployeeValidator();
		do {
			Employee emp= new Employee();
			
			System.out.println("1.Add Employee ");
			System.out.println("2.Delete Employee ");
			System.out.println("3.update INsurance Scehme");
			System.out.println("4.Print Employee List");
			System.out.println("5.Exit");
			System.out.println("Enter Option :-> ");
			option= sc.nextInt();
			switch(option) {
			case 1 :
				try {
				System.out.println("Enter Employee id ");
				id= sc.next();
				if(validator.validateEmpId(id)==false)
					throw new EmployeeException("Invalid Employee id " );
				
				System.out.println("Enter name ");
				String name= sc.next();
				
				if(validator.validateName(name)==false)
					throw new EmployeeException("Invalid Name Format");
				System.out.println("Enter Salary ");
				String salary= sc.next();
				
				Scanner sc1= new Scanner(System.in);
				System.out.println("Enter Designation ");
				String desig= sc1.nextLine();
				
				if(validator.validateDesignation(desig)==false)
					throw new EmployeeException("Invalid Designation entered...");
				emp.setDesignation(desig);
				emp.setEmpid(Integer.parseInt(id));
				emp.setName(name);
				emp.setSalary(Double.parseDouble(salary));
				
			emp= service.AddEmployee(emp);
			System.out.println("Employee added "+ emp.getEmpid());
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		break;
			case 3:
				System.out.println("Enter Employee ID : ");
				id= sc.next();
				try {
					emp= service.updateInsuranceScheme(Integer.parseInt(id));
					System.out.println(emp);
				} catch (EmployeeException e1) {
					System.out.println(e1.getMessage());
				}
				
				break;
			case 2:
				System.out.println("Enter Employee id ");
				id= sc.next();
				try {
					emp= service.deleteEmployee(Integer.parseInt(id));
					System.out.println("Employee deleted.."+ emp.getEmpid());
				} catch (EmployeeException e1) {
					System.out.println(e1.getMessage());
				}
				break;
			case 4 :
		try {
			ArrayList<Employee> list= service.getEmployeeList();
			for(Employee e : list) {
				System.out.println(e);
			}
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		break;
			case 5 :
					System.exit(0);
			}
		}while(option!=5);
	}
}
