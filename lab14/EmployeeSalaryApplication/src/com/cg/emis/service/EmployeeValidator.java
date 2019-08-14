package com.cg.emis.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeValidator {

	public boolean validateEmpId(String id) {
		if(id==null)
			throw new NullPointerException();
		Pattern pat=Pattern.compile("^[0-9]{6}$");
		Matcher mat= pat.matcher(id);
		if(mat.matches())
			return true;
		else
			return false;
	}
	public boolean validateName(String name) {
		
		Pattern pat= Pattern.compile("^[A-Z][a-z]{4,15}$");
		Matcher mat= pat.matcher(name);
		if(mat.matches())
			return true;
		else
			return false;
	}
	public boolean validateDesignation(String desig) {
		
		if(desig.equalsIgnoreCase("System Associate") || 
			desig.equalsIgnoreCase("Programmer")	 ||
			desig.equalsIgnoreCase("Manager") || 
			desig.equalsIgnoreCase("Clerk"))
			return true;
			else
				return false;
			
	}
}
