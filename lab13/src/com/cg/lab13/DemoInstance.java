package com.cg.lab13;

import java.util.Scanner;

interface sayable
	{
		String toString1();
	}

public class DemoInstance {
	
	private static int eid;
	private String ename;
	private static long esal;
	public static int getEid() {
		return eid;
	}
	public static void setEid(int eid) {
		DemoInstance.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public static long getEsal() {
		return esal;
	}
	public static void setEsal(long esal) {
		DemoInstance.esal = esal;
	}
	
	
	
	@Override
	public String toString() {
		return "eid:"+eid+"ename:"+ename+"esal:"+esal;
	}
	private static void main(String[]args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id name and salary");
	int id=sc.nextInt();
	String name=sc.nextLine();
	long sal=sc.nextLong();
	DemoInstance e=new DemoInstance();
	e.setEname(name);
	e.setEid(id);
	e.setEsal(sal);
	sayable s=e::toString;
	System.out.println(e.toString());
	
	}

}
