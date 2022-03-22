package com.training.spring.model;

public class To {
	
	private String toEmail;
	private String toName;
	
	public To() {
		super();
	}

	public To(String toEmail, String toName) {
		super();
		this.toEmail = toEmail;
		this.toName = toName;
	}

	public String getToEmail() {
		return toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	public String getToName() {
		return toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

	@Override
	public String toString() {
		return "To [toEmail=" + toEmail + ", toName=" + toName + "]";
	}
	
	

}

