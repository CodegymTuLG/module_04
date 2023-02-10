package com.codegym.service;

import com.codegym.model.EmailConfig;
import org.springframework.stereotype.Service;

@Service
public interface IEmailConfigService {
    EmailConfig update(EmailConfig emailConfig);
}
