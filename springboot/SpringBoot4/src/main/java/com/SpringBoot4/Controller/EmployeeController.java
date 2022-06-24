package com.SpringBoot4.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot4.model.Employee;
import com.SpringBoot4.model.EmployeeRepositoy;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepositoy employeeRepositoy;
	
	@RequestMapping("/displayAll")
	public Iterable<Employee> getAllEmployee(){
		return employeeRepositoy.findAll();
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("ename")String ename,@ModelAttribute("eemail") String eemail,@ModelAttribute("elocation") String elocation) {
		Employee e=new Employee(ename, eemail, elocation);
		employeeRepositoy.save(e);
		return "<html><body bgcolor='coral'>Added Employee Successfully<br><a href='/displayAll'>View All Employee</a></body></html>";
	}
	@RequestMapping(value = "/display/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		
		return employeeRepositoy.findById(id);
		
	}

}
