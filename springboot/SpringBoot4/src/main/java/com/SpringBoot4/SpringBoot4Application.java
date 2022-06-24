package com.SpringBoot4;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.SpringBoot4.model.Employee;
import com.SpringBoot4.model.EmployeeRepositoy;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.SpringBoot4.model")
@EntityScan(basePackages = "com.SpringBoot4.model")
@ComponentScan(basePackages = "com.SpringBoot4.controller")
public class SpringBoot4Application {

	@Autowired
	EmployeeRepositoy employeeRepositoy;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot4Application.class, args);
	}
	@PostConstruct
	public void init() {
		System.out.println("inside save");
		Employee e1=new Employee("Kumar ", "kumar@wipro.com", "hyd");
		Employee e2=new Employee("Kumari", "kumari@wipro.com", "mumbai");
		Employee e3=new Employee("pavan", "pavan@wipro.com", "bgr");

		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		employeeRepositoy.saveAll(list);
	}

}
