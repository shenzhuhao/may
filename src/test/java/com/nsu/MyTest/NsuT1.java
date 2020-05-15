package com.nsu.MyTest;

import com.nsu.NsuApp;
import com.nsu.pojo.student;
import com.nsu.service.JmsService;
import com.nsu.service.RedisService;
import com.nsu.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NsuApp.class)
@AutoConfigureMockMvc
public class NsuT1 {

    @Test
    public void run(){
        System.out.println(11111);
    }

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void run1() throws Exception {
        MvcResult mvcResult =  mockMvc.perform( MockMvcRequestBuilders.get("/nsu/echo?name=123456") ).
                andExpect( MockMvcResultMatchers.status().isOk() ).andReturn();
        int status = mvcResult.getResponse().getStatus();
        System.out.println(status);

    }

    @Autowired
    private StudentService studentService;

    @Test
    public void run2(){
       /* student student=new student();
        student.setId(10);
        student.setUsername("世界和平");
        student.setPassWord("99988876");
        System.out.println(studentService.inin(student));
        System.out.println("id is"+student.getId());*/
    }

    @Autowired
    private RedisService redisService;

    @Test
    public void run3(){
        redisService.set("username", "张璐瑶");
        System.out.println(redisService.getForKey("username"));
    }

    @Autowired
    private JmsService jmsService;

    @Test
    public void run4(){
        jmsService.sendMessage("这个是自定义的");
        jmsService.sendMessageForTopic("我是 topic" );
    }


































}
