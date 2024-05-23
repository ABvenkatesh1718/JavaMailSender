package com.main.Controller;


import com.main.mailSender.Email;
import com.main.mailSender.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailSendController {
	
	
	private EmailService emailService;
	
	public EmailSendController(EmailService emailService) {
		this.emailService = emailService;
	}
	
	@PostMapping("/sendEmail")
	public String sendEmail(@RequestBody Email email) {
		String sendEmail = emailService.sendEmail (email);
		System.out.println ("mail is sended");
		
		return sendEmail;
	}
}
