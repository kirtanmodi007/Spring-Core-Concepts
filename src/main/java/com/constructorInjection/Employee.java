package com.constructorInjection;

import java.util.List;

public class Employee 
{
	private String employeeName;
	private int employeeId;
	
	//Now aapde 1 reference type no variable pan create kari rahya 6iye.
	private Certificate certificate;
	
	/*
	 * Now agar aapde Property Injection / Setter Injection wadi method use karwana hot,
	 * to Getters ad setters methods create karat.
	 * But aapde ahi CONSTRUCTOR INJECTION karwana , so ae getters setters methods
	 * create karwani jaroor nathi.
	 */
	
	private List<String> list;
	
	public Employee(String employeeName, int employeeId, Certificate certificate, List<String> list)
	{
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.certificate = certificate;
		this.list = list;
	}
	
	/*
	   We are just making a toString() method so that object ni values easily write down
		kari shakay.
		Java ma already objects mate toString method 6e, that's why we have to Override 
		the older method.
	*/
	
	@Override
	public String toString()
	{
		return this.employeeName+" :" +this.employeeId+" : "+this.certificate +" : "+this.list;
	}
}
