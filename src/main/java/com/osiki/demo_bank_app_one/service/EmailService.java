package com.osiki.demo_bank_app_one.service;

import com.osiki.demo_bank_app_one.payload.request.EmailRequest;

public interface EmailService {
    void sendEmailAlert(EmailRequest emailRequest);
}
