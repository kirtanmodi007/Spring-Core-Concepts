package com.springBeanLifeCycle;

public class Student 
{
	private String firstName;
	private String lastName;
	
		
	public Student() 
	{
		super();
	}
	
		
	public Student(String firstName, String lastName) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		System.out.println("Let just make sure I was called before init method FIRSTNAME");
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		System.out.println("Let's just make sure I was called before init method LASTNAME");
		this.lastName = lastName;
	}


	@Override
	public String toString() 
	{
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	/*
	 * Now Spring bean ni life cycle maintain rakhwa mate we need 2 methods.
	 * 1. public void init()
	 * 2. public void destroy()
	 * You can change the name, but this naming convertion is more prefered.
	 * Now we need to mention in our bean configuration file that which one is our
	 * initialization method and which one is our destroy method.
	 * aa methods ne call aapde karwani jarur nathi ae spring aeni rite kari dese.
	 */
	public void init()
	{
		System.out.println("We are inside init method");
	}
	
	public void destroy()
	{
		System.out.println("We are inside destroy method");
	}
}
