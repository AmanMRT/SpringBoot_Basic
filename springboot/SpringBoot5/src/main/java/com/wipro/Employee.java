package com.wipro;

public class Employee {

	String empId;
	String empName;
	String empMail;
	String empLoc;
	
	public Employee(String empId, String empName, String empMail, String empLoc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMail = empMail;
		this.empLoc = empLoc;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public String getEmpLoc() {
		return empLoc;
	}

	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}
		
}
