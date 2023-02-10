package com.codegym.service;

import com.codegym.model.EmailConfig;
import com.codegym.responsitory.IEmailConfigResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailConfigService implements IEmailConfigService{
    @Autowired
    IEmailConfigResponsitory emailConfigResponsitory;
    @Override
    public EmailConfig update(EmailConfig emailConfig) {
        return emailConfigResponsitory.update(emailConfig);
    }
}
