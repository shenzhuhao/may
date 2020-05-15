package com.nsu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class ResultData {


    public Object data;
    @JsonProperty("哇哇哇")
    public int code;
    /**
     * 和控制台直接输出的日期不一样
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",locale="zh",timezone="GMT+8")
    public Date date;

    public ResultData(){

    }

    public ResultData(Object data, int code,Date date) {
        this.data = data;
        this.code = code;
        this.date = date;
    }




}
