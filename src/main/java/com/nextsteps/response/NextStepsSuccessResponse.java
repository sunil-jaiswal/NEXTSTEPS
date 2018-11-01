/**
 * 
 */
package com.nextsteps.response;

/**
 * @author sunil
 *
 */
public class NextStepsSuccessResponse extends NextStepsResponse {
	
	Object data;
	
	 public NextStepsSuccessResponse() {

		    this.setStatus("success");
		    this.setMessage("Service executed successfully");
	}

	
	public NextStepsSuccessResponse(String message) {
		this.setStatus("success");
		this.setMessage(message);
	}
	
	 public NextStepsSuccessResponse(Object data) {

		    this.setStatus("success");
		    this.setMessage("Service executed successfully");
		    this.data = data;
    }


	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}

	 
}
