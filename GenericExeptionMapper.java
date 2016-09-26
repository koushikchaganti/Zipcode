package com.koushikchaganti.pincode.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
@Provider
public class GenericExeptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable ex) {
		// TODO Auto-generated method stub
		ErrorMessage er = new ErrorMessage(ex.getMessage(),500,"http://www.koushikchaganti.com");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(er).build();
	}

}
