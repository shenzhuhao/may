package com.nsu.service;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.Queue;

@Service
public class JmsService {



    @Autowired
    private JmsMessagingTemplate jmsTemplate;

    public void sendMessage(String msg){
        Destination queue=new ActiveMQQueue("nsu-shenzhuhao");
        //不指定的话，就用默认的
        jmsTemplate.convertAndSend(queue, msg);
    }



    public void sendMessageForTopic(String msg){
        Destination queue=new ActiveMQTopic("nsu-topic");
        jmsTemplate.convertAndSend(queue, msg );
    }










}
