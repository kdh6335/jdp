package com.jdp.jdp.mybatis.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jdp.jdp.mybatis.mapper.testMapper;

@Service
@Transactional
public class testService{

    @Autowired
    private testMapper mapper;

    public ArrayList<HashMap<String, Object>> testGetData() throws Exception{
        return mapper.testGetData();
    }
}