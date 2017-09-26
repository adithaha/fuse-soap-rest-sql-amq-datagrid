package org.jboss.fis2.demo.rest;

import org.apache.camel.Body;
import org.apache.camel.ExchangeProperty;
import org.jboss.fis2.demo.soap.Employee;
import org.jboss.fis2.demo.soap.EmployeeList;

public class Processor {

	
	public Status createStatus() {
        Status status = new Status();
        status.setCode("0");
        status.setMessage("SUCCESS");
		return status;
    }
	
	public EmployeeListResponse transformEmployeeListResponse(@Body Object obj, @ExchangeProperty(value="DEMO_status") Status status) {
        EmployeeListResponse response = new EmployeeListResponse();
        response.setStatus(status);
        
        if (obj instanceof EmployeeList) {
        	response.setEmployeeList((EmployeeList)obj);
        }        
        
		return response;
    }
	
	public EmployeeResponse transformEmployeeResponse(@Body Object obj, @ExchangeProperty(value="DEMO_status") Status status) {
        EmployeeResponse response = new EmployeeResponse();
        response.setStatus(status);
        
        if (obj instanceof Employee) {
        	response.setEmployee((Employee)obj);
        }        
        
		return response;
    }
}
