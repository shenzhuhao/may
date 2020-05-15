package com.nsu;

import com.nsu.configuire.MyCon;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;


@SpringBootApplication
@ComponentScan("com.nsu")
@ServletComponentScan
@MapperScan("com.nsu.dao")
@EnableScheduling
@EnableAsync
@EnableJms
public class NsuApp {


    /**
     * 多环境配置
     * 而且在resource下的config下面创建才可以,也可以不创建
     * 主propertie中配置 spring。profiles。active=dev
     * 创建一个application-dev。properties
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(NsuApp.class, args);
    }

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(activeMQConnectionFactory);
        return bean;
    }



}