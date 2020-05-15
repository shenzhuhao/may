package com.nsu.web;

import com.nsu.pojo.ResultData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("/up")
public class UpController {

    @RequestMapping("/upload")
    public ResponseEntity<ResultData> upload(MultipartFile myFile) throws IOException {
        myFile.transferTo(new File("E:/xd/aaabbbccc.jpg"));
        return ResponseEntity.ok(new ResultData("ok",200,new Date()));
    }











}
