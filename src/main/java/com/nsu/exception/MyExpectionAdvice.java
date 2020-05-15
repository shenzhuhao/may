package com.nsu.exception;

import com.nsu.pojo.ResultData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class MyExpectionAdvice {


    @ExceptionHandler(value=NsuExpection.class)
    public ResponseEntity<ResultData> ExpectionForEcho(){
        return ResponseEntity.ok(new ResultData("出现错误了",500,new Date()));
    }















}
