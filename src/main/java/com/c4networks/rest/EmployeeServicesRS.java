package com.c4networks.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.c4networks.vo.Employee;

@Path("/employee")
public class EmployeeServicesRS {

	@POST
	@Path("/createEmp")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createEmployee(Employee emp) {
		System.out.println("In EmployeeServices.createEmployee..**");
		String result = "SUCCESS";
		System.out.println(emp);
		return Response.status(201).entity(result).build();
	}

	@GET
	@Path("/getEmpDtls")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeDetails(@QueryParam(value = "empId") final Integer empId) {
		System.out.println("In EmployeeServices.getEmployeeDetails....**..");
		System.out.println("emp id received to server is :"+empId);
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setEmpName("M Upender");
		emp.setMobile("+91 98496 13769");
		emp.setAddress("Hyderabad");
		emp.setEmail("upender0209@gmail.com");
		return emp;
	}

}
