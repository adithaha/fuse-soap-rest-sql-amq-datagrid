package org.jboss.fis2.demo.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Consumes({"application/json"})
@Produces({"application/json"})
public class EmployeeRS {

	@GET
    @Path("/getemployeelist/{name}")
    public EmployeeListResponse getEmployeeList(
    	@PathParam("name")  java.lang.String arg0
    ) {
    	return null;
    }

	@GET
    @Path("/getemployee/{id}")
    public org.jboss.fis2.demo.soap.Employee getEmployee(
        @PathParam("id") java.lang.String arg0
    ) {
    	return null;
    }

	@POST
    @Path("/addemployeebulk")
    public EmployeeListResponse addEmployeeBulk(
        org.jboss.fis2.demo.soap.EmployeeList arg0
    ) {
    	return null;
    }

	@POST
    @Path("/addemployeebulkasync")
    public String addEmployeeBulkAsync(
        org.jboss.fis2.demo.soap.EmployeeList arg0
    ) {
    	return null;
    }
	
	@GET
    @Path("/getemployeeall")
    public EmployeeListResponse getEmployeeAll() {
    	return null;
    }

	@POST
    @Path("/addemployee")
    public org.jboss.fis2.demo.soap.Employee addEmployee(
        org.jboss.fis2.demo.soap.Employee arg0
    ) {
    	return null;
    }
}
