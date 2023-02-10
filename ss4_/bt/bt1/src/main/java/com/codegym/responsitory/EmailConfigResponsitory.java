package com.codegym.responsitory;

import com.codegym.model.EmailConfig;
import com.codegym.service.IEmailConfigService;
import org.springframework.stereotype.Repository;

@Repository
public class EmailConfigResponsitory implements IEmailConfigResponsitory {
    @Override
    public EmailConfig update(EmailConfig emailConfig) {
        return new EmailConfig(emailConfig.getLanguage(), emailConfig.getPageSize(), emailConfig.isEnableFlg(), emailConfig.getSignature());
    }
}
