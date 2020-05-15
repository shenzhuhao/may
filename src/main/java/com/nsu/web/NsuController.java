package com.nsu.web;

import com.nsu.TimerTask.NsuTask;
import com.nsu.configuire.MyCon;
import com.nsu.exception.NsuExpection;
import com.nsu.pojo.ResultData;
import org.omg.DynamicAny._DynAnyFactoryStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/nsu")
@EnableConfigurationProperties(MyCon.class)
public class NsuController {

    @Autowired
    private MyCon myCon;

    @Value("${shenzhuhao.name}")
    private String myname;

    @RequestMapping("/echo")
    public ResponseEntity<ResultData> Echo(@RequestParam(name = "name",defaultValue ="沈朱豪") String echo){
        System.out.println(myCon);
        System.out.println(myname);
        return ResponseEntity.ok(new ResultData(echo,200,new Date()));
    }


    @RequestMapping("/echo2")
    public ResponseEntity<ResultData> Echo2() {
        try{
            System.out.println(1/0);
        }catch (Exception e){
            throw new NsuExpection(e.getMessage());
        }
        return ResponseEntity.ok(new ResultData(null,200,new Date()));
    }

    @Autowired
    private NsuTask nsuTask;

    @RequestMapping("/echo3")
    public ResponseEntity<ResultData> Echo3() {
        Future<String> future = nsuTask.echo2();
        System.out.println(999);
        while(true){
            if(future.isDone()){
                break;
            }
        }
        return ResponseEntity.ok(new ResultData(null,200,new Date()));
    }













}
