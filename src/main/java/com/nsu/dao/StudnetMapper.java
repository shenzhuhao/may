package com.nsu.dao;

import com.nsu.pojo.student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface StudnetMapper extends Mapper<student> {

    @Select("select * from student where username like #{name}")
    @Results(@Result(property = "passWord",column ="password"))
    List<student> get(String name);

    @Insert("insert into student (id,username,password) value(10,#{username},#{passWord})")
    int inin(student student);






}
