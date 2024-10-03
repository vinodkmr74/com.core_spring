package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.Entity.Employee;

public class App {
	
	public static void main(String args[])
	{
		
		ApplicationContext ioc=new ClassPathXmlApplicationContext("ApplicationContexxt.xml");
		
		Employee bean=  (Employee) ioc.getBean("emp");
		
		System.out.println(bean);
		
		
		
		
		
	}

}
