package com.nsu.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsLisrern {


    @JmsListener(destination = "nsu-shenzhuhao")
    public void reveive1(String text){
        System.out.println(text);
    }

    @JmsListener(destination = "nsu-common")
    public void reveive2(String text){
        System.out.println(text);
    }

    @JmsListener(destination = "nsu-topic",containerFactory = "jmsListenerContainerTopic")
    public void reveive3(String text){
        System.out.println("消费者1"+text);
    }

    @JmsListener(destination = "nsu-topic",containerFactory = "jmsListenerContainerTopic")
    public void reveive4(String text){
        System.out.println("消费者2"+text);
    }











}
