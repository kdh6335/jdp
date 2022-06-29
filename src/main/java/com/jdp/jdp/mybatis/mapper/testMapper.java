package com.jdp.jdp.mybatis.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface testMapper {

    public ArrayList<HashMap<String, Object>> testGetData() throws Exception;
    
}
