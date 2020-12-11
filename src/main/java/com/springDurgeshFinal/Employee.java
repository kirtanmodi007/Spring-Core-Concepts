package com.springDurgeshFinal;

import java.util.*;

public class Employee 
{
	//This is going to be my Java Bean Class.
	//So, we will not make object of this class directly, instead we will ask SPRING CONTAINER
	//to provide its object at RUN TIME.
	
	private String employeeName;
	private List<String> employeeNumbers;
	private Set<String> employeeAddress;
	private Map<String, String> employeeCourses;
	
	
	
	
	public Employee(String employeeName, List<String> employeeNumbers, Set<String> employeeAddress,
			Map<String, String> employeeCourses) {
		super();
		this.employeeName = employeeName;
		this.employeeNumbers = employeeNumbers;
		this.employeeAddress = employeeAddress;
		this.employeeCourses = employeeCourses;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<String> getEmployeeNumbers() {
		return employeeNumbers;
	}
	public void setEmployeeNumbers(List<String> employeeNumbers) {
		this.employeeNumbers = employeeNumbers;
	}
	public Set<String> getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(Set<String> employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public Map<String, String> getEmployeeCourses() {
		return employeeCourses;
	}
	public void setEmployeeCourses(Map<String, String> employeeCourses) {
		this.employeeCourses = employeeCourses;
	}
}
