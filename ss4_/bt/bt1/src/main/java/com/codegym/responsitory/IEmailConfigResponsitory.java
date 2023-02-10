package com.codegym.responsitory;

import com.codegym.model.EmailConfig;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmailConfigResponsitory {
    EmailConfig update(EmailConfig emailConfig);
}
