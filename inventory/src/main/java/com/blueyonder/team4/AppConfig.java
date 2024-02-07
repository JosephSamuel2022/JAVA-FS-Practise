package com.blueyonder.team4;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.blueyonder.modal.Address;
import com.blueyonder.modal.Employee;

@Configuration
//@ComponentScan(basePackages="com.blueyonder.modal")
public class AppConfig {
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Employee getEmployee() {
		return new Employee();
		
	}
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Address getAddress() {
		return new Address();
	}
}
