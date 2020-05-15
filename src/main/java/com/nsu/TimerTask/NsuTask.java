package com.nsu.TimerTask;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class NsuTask {





    //@Scheduled(fixedRate = 2000)
    public void echo(){
        //1、cron 定时任务表达式 @Scheduled(cron="*/1 * * * * *") 表示每秒
        //1）crontab 工具  https://tool.lu/crontab/
        //2、fixedRate: 定时多久执行一次（上一次开始执行时间点后xx秒再次执行；）
        //3、fixedDelay: 上一次执行结束时间点后xx秒再次执行
        //4、fixedDelayString:  字符串形式，可以通过配置文件指定
        System.out.println("感觉怎么样");
    }

    //@Async
    public Future<String> echo2(){
        System.out.println(6666);
        System.out.println(6666);
        System.out.println(6666);
        System.out.println(6666);
        System.out.println(6666);
        return new AsyncResult<>("ok");
    }









}
