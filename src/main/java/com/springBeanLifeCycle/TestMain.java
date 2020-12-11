package com.springBeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) 
	{
		//STEP - 1 MAKE AN IOC CONTAINER
		ApplicationContext container = new ClassPathXmlApplicationContext("com/springBeanLifeCycle/ConfigBeanLifeCycle.xml");
		
		//STEP - 2 MAKE AN OBJECT OF THE OTHER CLASS.
		/*
		Now with the help of the IOC container we can easily get the BEAN
		and create an Object.
		*/
		Student studentObj = (Student) container.getBean("StudentBean");
		
		//Now we have the object (loosely Coupled), we can call any method.
		System.out.println(studentObj.toString());
		
		Employee employeeObj = (Employee) container.getBean("EmployeeBean");
		
		System.out.println(employeeObj.toString());
		
		
		//Making object of Professor class to check Java Annotation Implementation
		Professor professorObj = (Professor) container.getBean("ProfessorBean");
		
		System.out.println(professorObj.toString());
		
		
		//IOC container ne close karwu is a good habbit.
		((AbstractApplicationContext) container).close();		
	}

}
