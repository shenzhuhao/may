package com.nsu.configuire;


import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@ToString
@ConfigurationProperties
@PropertySource(value="classpath:student.properties")
@Configuration
public class MyCon {

    @Value("${my.name}")
    private String name;
    @Value("${my.password}")
    private String password;
    @Value("${my.second}")
    private String second;
    @Value("${my.car}")
    private String car;

    @Value("${shenzhuhao.name}")
    private String myname;





}
