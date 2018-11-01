/**
 * 
 */
package com.nextsteps.response;

/**
 * @author sunil
 *
 */
public abstract class NextStepsResponse {

	String status;
	
	String message;

	protected String getStatus() {
		return status;
	}

	protected void setStatus(String status) {
		this.status = status;
	}

	protected String getMessage() {
		return message;
	}

	protected void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
