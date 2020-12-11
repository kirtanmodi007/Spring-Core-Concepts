package com.springBeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Professor 
{
	private String professorFirstName;
	private String professorLastName;
		
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProfessorFirstName() {
		return professorFirstName;
	}
	public void setProfessorFirstName(String professorFirstName) {
		this.professorFirstName = professorFirstName;
	}
	public String getProfessorLastName() {
		return professorLastName;
	}
	public void setProfessorLastName(String professorLastName) {
		this.professorLastName = professorLastName;
	}
	@Override
	public String toString() {
		return "Professor [professorFirstName=" + professorFirstName + ", professorLastName=" + professorLastName + "]";
	}
	
	//Now we are going to make 2 function for init() & destroy() using Java Annotations
	//New JAVA ma aa banne annotations available nathi.
	//So we need to import the dependency from internet and put it inside our pom.xml file.
	
	//BY DEFAULT BADHA ANNOTATIONS DIABLE HASE.
	//SO, IN THE CONFIG FILE WE NEED TO ADD A NEW TAG INSIDE OUR MAIN BEAN
	//		`<Context:annotation-config/>
	
	@PostConstruct
	public void init()
	{
		System.out.println("This is my init function implemented using java Annotation");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("This is my destroy function implemented using java Annotation");
	}
}
