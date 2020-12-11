package com.constructorInjection;

public class Addition 
{
	private int a;
	private int b;
	
	//Now we are going to do Constructor Overloading
	//Here, first constructor accepts int type data.
	//My second constructor will be accepting float type data.
	
	public Addition(int a, int b) 
	{
		this.a = a;
		this.b = b;
		System.out.println("We got this values using INTEGER TYPE CONSTRUCTOR");
	}
	
	public Addition(float a, float b) 
	{
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("We got this values using FLOAT TYPE CONSTRUCTOR");
	}
	
	public int sum()
	{
		return this.a + this.b;
	}
}
