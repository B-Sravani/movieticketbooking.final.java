package com.sprint1.movie.booking.ticket1.booking.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class TicketNotExistsException extends RuntimeException{

	public TicketNotExistsException() {
		super();
	}

	public TicketNotExistsException(String message) {
		super(message);
	}

	
}
