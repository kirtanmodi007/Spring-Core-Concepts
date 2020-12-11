package com.springDurgeshFinal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //Here, context is my SPRING CONTAINER.
        //And aapde aa conext (Spring COntainer) ne je class no object joito hoy te mangi shakiye 6iye
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        //So, ahi just mention kar tane je bean no object joito hoy aenu name.
        StudentBean studentObject = (StudentBean) context.getBean("Student");
        
        /*So, now Spring Container (Context) ae runtime par tane StudentBean class no
        object provide kari dese and this is loose coupling.*/
        
       //StudentBean studentBeanObject = (StudentBean) context.getBean("Student");
        
        //Here, why are we type casting???
        /* So, now you have reference variable of StudentBean class,
        So, you can call any approprite methods or variables using Getters */
        
        System.out.println(studentObject.getStudentId());
        System.out.println(studentObject.getStudentName());
        System.out.println(studentObject.getStudentAddress());
        
        /*
         * NOW LET'S CHECK / TRY KE AAPDE 1 J SPRING CONTAINER THI MULTIPLE BEANS NE
         * HANDLE KARI SHAKIYE 6IYE KE NAHI.
         * PROVED: 1 SPRING CONTAINER CAN HANDLE MULTIPLE JAVA POJO CLASSES OR BEANS.
         */
        
        //ApplicationContext employeeContext = new ClassPathXmlApplicationContext("config.xml");
        
        //employeeContext je reference variable 6e ae actual ma taru springContainer 6e.
        
        //Have aa SpringCOntainer j object ni aakhi life cycle ne handle karshe.
        
        //Have tu aa springContainer through tara class no object create kar.
        //Me employeeContext reference variable / spring container ne kidhu ke
        //ja jai ne mara mate config file mathi "Employee" name no Bean lai aay.
        Employee employeeObject = (Employee) context.getBean("Employee1");
        
        //SO. NOW YOUR OBJECT IS READY.
        System.out.println(employeeObject.getEmployeeName());
        System.out.println(employeeObject.getEmployeeAddress());
        System.out.println(employeeObject.getEmployeeCourses());
        System.out.println(employeeObject.getEmployeeNumbers());
        /*for(int i = 0; i < myObj.getEmployeeAddress().size(); i++)
        {
        	System.out.println(myObj.getEmployeeAddress(i));
        }
        */
        //System.out.println(myObj.getEmployeeName());
        
        
        
        /*
         * Now we are creating the reference variable of ReferenceNeededClass.
         * That ReferenceNeededClass requires an object of ReferenceProviderClass.
         * but here we are not gonna do hard coupling and make object by ourselves.
         * but we are actually gonna use spring's dependency operation.
         */
        
        ReferenceNeededClass rncObject = (ReferenceNeededClass) context.getBean("rnc");
        
        //Now we have the object of ReferenceNeededClass.
        //We can simply use all of its methods.
        
        System.out.println(rncObject.getX());
        System.out.println(rncObject.getRpc());
        
        //Now we are fetching the y value using rnc's object.
        System.out.println(rncObject.getRpc().getY());
    }
}
