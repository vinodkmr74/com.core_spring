package spring.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.Emp.Employee;

public class App {
	
	public static void main(String args[])
	{
		
		ApplicationContext ioc=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	Employee bean=	ioc.getBean(Employee.class,"emp2");
		
		System.out.println(bean);
	}

}
