package com.springBeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean
{
	private String employeeFirstName;
	private String employeeLastName;

	public Employee(String employeeFirstName, String employeeLastName) 
	{
		super();
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
	}
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	@Override
	public String toString() {
		return "Employee [employeeFirstName=" + employeeFirstName + ", employeeLastName=" + employeeLastName + "]";
	}
	
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("I got this bean using InitializingBean Interface");
	}
	
	
	public void destroy() throws Exception 
	{
		System.out.println("I got this bean using DisposableBean Interface");
	}

	
	
}
