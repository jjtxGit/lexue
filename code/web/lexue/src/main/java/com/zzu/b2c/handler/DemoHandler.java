package com.zzu.b2c.handler;

import com.zzu.b2c.bean.Demo;
import com.zzu.b2c.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jian on 05/05/17.
 */
@RequestMapping("demo")
@Controller
public class DemoHandler {

    @Autowired
    private DemoService demoService;


    @RequestMapping("test")
    public String demoTest(){

       List<Demo> demoList= demoService.demoList();

        System.out.println(demoList.size());

       return "demo/demo";

    }

}
