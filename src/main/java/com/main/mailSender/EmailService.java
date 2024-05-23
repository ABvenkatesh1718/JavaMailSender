package com.main.mailSender;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	private final JavaMailSender javaMailSender;
	@Value ("${spring.mail.username}")
	private String sender;
	
	public EmailService (JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	
	public String sendEmail (Email email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(sender);
		message.setTo(email.getRecipient());
		message.setText(email.getMessage());
		message.setSubject(email.getSubject());
		javaMailSender.send(message);
		return "Email sent successfully";
	}
	
}
