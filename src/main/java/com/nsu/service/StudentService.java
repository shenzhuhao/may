package com.nsu.service;

import com.nsu.dao.StudnetMapper;
import com.nsu.pojo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudnetMapper studnetMapper;

    public List<student> get(){
        return studnetMapper.get("%沈朱豪%");
    }

    public int inin(student student){
        return studnetMapper.inin(student);
    }





}
