package com.capgemini.InvoiceCalculator_46007582.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



@ControllerAdvice
public class InvoiceNotFoundHandler {

	@ExceptionHandler(InvoiceNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody InvoiceResponse handleResourceNotFound(final InvoiceNotFoundException exception,
			final HttpServletRequest request) {

		InvoiceResponse error = new InvoiceResponse();
		error.setErrorMessage(exception.getMessage());
		error.callerURL(request.getRequestURI());

		return error;
	}
	

}
