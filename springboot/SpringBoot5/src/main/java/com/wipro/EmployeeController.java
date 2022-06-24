package com.wipro;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDAO employeeDAO;
	
	@GetMapping("/")
	public Map<String, Employee> getAll()
	{
		return employeeDAO.getAll();
	}
	
	@GetMapping("/{empId}")
	public Employee getId(@PathVariable String empId)
	{
		return employeeDAO.getId(empId);
	}
	
	@PostMapping(value="/")
	public Map<String, Employee> addEmp(@RequestBody Employee employee)
	{
		return employeeDAO.addEmp(employee);
	}
	
	@PutMapping("/{empId}")
	public Map<String, Employee> updateEmp(@PathVariable String empId, @RequestBody Employee employee)
	{
		employee.setEmpId(empId);
		return employeeDAO.updateEmp(employee);
	}
	
	@DeleteMapping("/{empId}")
	public Map<String, Employee> deleteEmp(@PathVariable String empId)
	{
		return employeeDAO.deleteEmp(empId);
	}
}
