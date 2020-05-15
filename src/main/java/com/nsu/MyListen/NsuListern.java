package com.nsu.MyListen;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class NsuListern implements ServletRequestListener {


    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("请求结束");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("请求开始");
    }




}
