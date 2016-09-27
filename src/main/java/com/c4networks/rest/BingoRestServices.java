package com.c4networks.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.c4networks.vo.Employee;

@Path(value = "/bingo")
public class BingoRestServices {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{dept}/{empId}")
	public Response getEmployeeObject(@PathParam("dept") String dept,
			@PathParam("empId") Integer empId) {
		System.out.println("empid :"+empId);
		System.out.println("dept :"+dept);
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setEmpName("Upender M");

		return Response.status(200).entity(emp).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/updateEmployee")
	public Response getEmployeeObject(Employee emp) {
		System.out.println("empid :"+emp.getEmpId());
		System.out.println("emp name :"+emp.getEmpName());

		return Response.status(200).entity("success").build();
	}

}
