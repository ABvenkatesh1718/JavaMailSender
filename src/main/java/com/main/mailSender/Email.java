package com.main.mailSender;



public class Email {

	private String recipient;
	private String subject;
	private String message;
	
	public String getRecipient () {
		return recipient;
	}
	
	public void setRecipient (String recipient) {
		this.recipient = recipient;
	}
	
	public String getSubject () {
		return subject;
	}
	
	public void setSubject (String subject) {
		this.subject = subject;
	}
	
	public String getMessage () {
		return message;
	}
	
	public void setMessage (String message) {
		this.message = message;
	}
}
