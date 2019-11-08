package com.example.exceptionsenderspringbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(NotificationProperties.class)
public class ConfigExceptionSender {


    @Bean
    public ExceptionSendingPostBeanProcessor exceptionHandlingPostBeanProcessor(){
        return new ExceptionSendingPostBeanProcessor();
    }

    @ConditionalOnMissingBean
    @Bean
    public Sender emailSender(){
        return new EmailSender();
    }
}
