package org.jboss.fis2.demo.rest;

import javax.xml.bind.annotation.XmlRootElement;

import org.jboss.fis2.demo.soap.Employee;

@XmlRootElement
public class EmployeeResponse {

	private Status status;
	private Employee employee;
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
}
