package com.blueyonder.team4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.blueyonder.modal.Address;
import com.blueyonder.modal.Employee;

@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
//		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
//		
//		
//		Employee e1=(Employee) ctx.getBean(Employee.class);
//		
//		e1.setEmployeeName("Joseph");
//		e1.setEmployeeId(123);
//		e1.setDateofBirth("01/01/2000");
//		
//		Address address=(Address) ctx.getBean(Address.class);
//		address.setLandMark("landmark");
//		address.setCity("city");
//		address.setCountry("country");
//		address.setState("state");
//		address.setStreet("street");
//		e1.setAddress(address);
//		Employee e=(Employee) ctx.getBean(Employee.class);
//		System.out.println(e);
//		System.out.println(e1);
//		
		
		
		
	}

}
