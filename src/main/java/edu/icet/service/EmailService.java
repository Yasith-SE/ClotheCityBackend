package edu.icet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    public void sendOtpEmail(String toEmail, String otpCode) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("ClotheCity - Verify Your Account");
        message.setText("Welcome to ClotheCity! Your verification code is: " + otpCode +
                "\n\nPlease enter this code to activate your account.");

        mailSender.send(message);
    }
}