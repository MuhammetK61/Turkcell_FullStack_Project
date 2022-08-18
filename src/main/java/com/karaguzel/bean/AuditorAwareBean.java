package com.karaguzel.bean;


import com.karaguzel.audit.AuditorAwareImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class AuditorAwareBean {

    @Bean
    public AuditorAware auditorAwareMethod(){
        return new AuditorAwareImp();
    }
}
