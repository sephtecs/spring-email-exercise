package com.training.spring.model;

public class Body {
	
	private String message;

	public Body() {
		super();
	}

	public Body(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Body [message=" + message + "]";
	}
	
	

}
