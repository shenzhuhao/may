package com.nsu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public String getForKey(String key){
        BoundValueOperations<String, String> ops = stringRedisTemplate.boundValueOps(key);
        return ops.get();
    }


    public void set(String key,String value){
        stringRedisTemplate.boundValueOps(key).set(value);
    }









}
