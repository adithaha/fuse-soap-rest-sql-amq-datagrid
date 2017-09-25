package org.jboss.fis2.demo.rest;

import javax.xml.bind.annotation.XmlRootElement;

import org.jboss.fis2.demo.soap.EmployeeList;

@XmlRootElement
public class EmployeeListResponse {

	private Status status;
	private EmployeeList employeeList;
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public EmployeeList getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(EmployeeList employeeList) {
		this.employeeList = employeeList;
	}
	
	
}
