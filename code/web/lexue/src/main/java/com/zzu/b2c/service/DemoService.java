package com.zzu.b2c.service;

import com.zzu.b2c.bean.Demo;
import com.zzu.b2c.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jian on 05/05/17.
 */
@Service
public class DemoService {

    @Autowired
    private DemoDao demoDao;


    public List<Demo> demoList(){

        return demoDao.getDemoList();
    }

}
