package com.hibjava.demo;

import java.util.Date;  

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibjava.entity.Customer;
import com.hibjava.service.CustomerServiceImpl;

public class DemoMain {
	public static void main(String[] args) {
		DemoMain d = new DemoMain();
			d.add();
		//	d.get();
		//	d.update();
		//	d.delete();
		
			d.showAll();
	}
	

void get() {
		try {
			ApplicationContext c = new ClassPathXmlApplicationContext("SpringConfig.xml");
			CustomerServiceImpl customerService = c.getBean("serv",CustomerServiceImpl.class);
			Customer c1=customerService.getCustomer(103);
			System.out.println(c1);
			} catch (Exception e) {
				e.printStackTrace();
			}
}


void add() {				
		try {
			ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");		
			Customer c1=context.getBean("s1",Customer.class);		
			CustomerServiceImpl impl=context.getBean("serv",CustomerServiceImpl.class);		
			impl.addCustomer(c1);
			} catch (Exception e) {
				e.printStackTrace();
			}							
}

void update() {
			ApplicationContext c=new ClassPathXmlApplicationContext("SpringConfig.xml");
			CustomerServiceImpl customerService=c.getBean("serv",CustomerServiceImpl.class);
			Date dt=new Date(1992, 8, 9);
			Customer c1=new Customer(102,"Priyanka"	,"Delhi",dt);
			try {
				customerService.UpdateCustomer(c1);
				System.out.println("Data Updated!!!");
				} catch (Exception e) {
					e.printStackTrace();
				}
}
		
	

void delete() {
	try {
		ApplicationContext c=new ClassPathXmlApplicationContext("SpringConfig.xml");
		CustomerServiceImpl customerService=c.getBean("serv",CustomerServiceImpl.class);
		customerService.deleteCustomer(101);
	} catch (Exception e) {
		e.printStackTrace();
	}	
}

void showAll()  {
	try {
		ApplicationContext c = new ClassPathXmlApplicationContext("SpringConfig.xml");
		CustomerServiceImpl customerService=c.getBean("serv",CustomerServiceImpl.class);
		System.out.println(customerService.getAllCustomer());
		} catch (Exception e) {
			e.printStackTrace();
		}	
} 


}
