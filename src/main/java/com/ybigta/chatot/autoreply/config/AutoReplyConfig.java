package com.ybigta.chatot.autoreply.config;

import com.ybigta.chatot.autoreply.service.ContentValidator;
import com.ybigta.chatot.autoreply.service.validator.ContentValidatorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoReplyConfig {
    @Bean
    public ContentValidator payloadValidator() {
        return new ContentValidatorImpl();
    }
}
