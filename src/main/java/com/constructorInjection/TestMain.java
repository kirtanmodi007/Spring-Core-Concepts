package com.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) 
	{
		System.out.println("Hi we are doing Constructor Injection");
		
		//If we want to use Employee class here, then we have create its object.
		
		//But using spring, we can make an IOC container and that IOC container will take
		//care of everything.
		
		/*
		So, ahi aapde EMployee class use karwa Spring Dependency Injection wadi 
		process follow karshu
		*/
		
		ApplicationContext myContainer = new ClassPathXmlApplicationContext("com/constructorInjection/ConfigConstructorInjection.xml");
		
		//Now with the help of IOC container we can create the object.
		Employee employeeObj = (Employee) myContainer.getBean("employeeBean");
		
		System.out.println(employeeObj.toString());
		
		//Now we are calling the addition methods object using IOC Container.
		Addition additionObj = (Addition) myContainer.getBean("additionBean");
		
		//Now when you have an object you can call any function easily.
		System.out.println("The sum of those numbers is: " +additionObj.sum());
		
	}
}
