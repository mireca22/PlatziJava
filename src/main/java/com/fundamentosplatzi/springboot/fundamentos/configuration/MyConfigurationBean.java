package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean2Implement;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyOperation;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyOperationImplement;
import com.fundamentosplatzi.springboot.fundamentos.bean.Mybean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public Mybean beanOperation() {
        return new MyBean2Implement();
    }

    @Bean
    public MyOperation beanOperationOperation() {
        return new MyOperationImplement();
    }
}
