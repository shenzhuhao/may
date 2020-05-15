package com.nsu.web;

import com.nsu.configuire.MyCon;
import com.nsu.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/free")
@EnableConfigurationProperties(MyCon.class)
public class FreeMakerController {

    @Autowired
    private MyCon myCon;

    @RequestMapping("/freemaker")
    public String freeMakerTest(ModelMap modelMap){
        modelMap.addAttribute("setting", myCon);
        System.out.println(myCon);
        return "fm/index";
    }












}
