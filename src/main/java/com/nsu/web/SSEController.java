package com.nsu.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sse")
public class SSEController {

    @RequestMapping(value = "/s",produces = "text/event-stream;charset=utf-8")
    public String sse() throws InterruptedException {
        Thread.sleep(2000);
        return "123123213";
    }






}
