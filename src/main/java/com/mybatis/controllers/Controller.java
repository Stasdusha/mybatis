/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.controllers;

import com.mybatis.dto.Fabric;
import com.mybatis.dto.Master;
import com.mybatis.services.MybatisServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Стас
 */
@RestController
public class Controller {
    
    @Autowired
    MybatisServices mybatisServices;
    
    @RequestMapping("/go")
    public Fabric goFabric(int id){
        
        Fabric fabric = mybatisServices.getFabric(id);
        
        return fabric;
    }
    
      @RequestMapping("/goc")
    public List<Master> goMasters(int id){
        
        return mybatisServices.getMasters(id);
    }
    
}
