package com.jdp.jdp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jdp.jdp.mybatis.service.testService;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/jdp")
public class  Controller {

    @Autowired
    private testService testService;

    @GetMapping(value = {"","/"})
    public String testEnter() {
        return "Hello World!!!!";
    }

    @RequestMapping(value = "/getTest", method = { RequestMethod.GET, RequestMethod.POST }, headers = "Accept=application/json; charset=utf8", produces = {MediaType.APPLICATION_JSON_VALUE })
    public ArrayList<HashMap<String, Object>> GetCCTVAPI(HttpServletRequest request) {
        ArrayList<HashMap<String, Object>> select = null;
        try {
            select =  testService.testGetData();
            System.out.println(select);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return select;
    }
    
    
}