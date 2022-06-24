package com.wipro;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class EmployeeDAO {

	public Map<String, Employee> empMap=new HashMap<String, Employee>();
	
	{
		empMap.put("EM001", new Employee("EM001","vishnu","vishnu@wipro.com","Bangalore"));
		empMap.put("EM002", new Employee("EM002","vijay","vijay@wipro.com","Bangalore"));
		empMap.put("EM003", new Employee("EM003","arjun","arjun@wipro.com","Chennai"));
	}
	
	public Map<String, Employee> getAll() {
		return empMap;
	}

	public Employee getId(String empId) {
		return empMap.get(empId);
	}

	public Map<String, Employee> addEmp(Employee employee) {
		empMap.put(employee.getEmpId(), employee);
		return empMap;
	}

	public Map<String, Employee> updateEmp(Employee employee) {
		empMap.replace(employee.getEmpId(), employee);
		return empMap;
	}

	public Map<String, Employee> deleteEmp(String empId) {
		empMap.remove(empId);
		return empMap;
	}
}
