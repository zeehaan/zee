
package com.practice.webservices.restfulwebservices.exception;
import java.util.Date;

public class ExceptionResponse {
	private String message;
	private String detail;
private Date  timestamp;
	public Date getTimestamp() {
	return timestamp;
}

public String getMessage() {
	return message;
}

public String getDetail() {
	return detail;
}
	public ExceptionResponse(Date timestamp, String message, String detail) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.detail = detail;
	}
}
