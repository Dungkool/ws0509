package com.kbstar.controller;

import com.kbstar.dto.Sales;
import com.kbstar.service.SalesService;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChartImplController {
    @Autowired
    SalesService service;

    @RequestMapping("/areaChart")
    public Object area() throws Exception {
        JSONArray ja= new JSONArray();

        for(int i=0;i<=12;i++){
            List<Sales> list = service.getmonth(i);
            int num=0;

            for(Sales s:list){
                num+=s.getPrice();
            }
            ja.add(num);
        }

        return ja;
    }

}