package com.osiki.demo_bank_app_one.service.impl;

import com.osiki.demo_bank_app_one.infrastructure.exception.EmailNotSendException;
import com.osiki.demo_bank_app_one.payload.request.EmailRequest;
import com.osiki.demo_bank_app_one.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String senderEmail;
    @Override
    public void sendEmailAlert(EmailRequest emailRequest) {
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

            simpleMailMessage.setFrom(senderEmail);
            simpleMailMessage.setTo(emailRequest.getRecipient());
            simpleMailMessage.setText(emailRequest.getMessageBody());
            simpleMailMessage.setSubject(emailRequest.getSubject());

            javaMailSender.send(simpleMailMessage);

            System.out.println("Mail sent successfully");
        } catch (MailException e) {
            throw new EmailNotSendException("Email not sent");
        }
    }
}
