/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.services;

import com.mybatis.dto.Fabric;
import com.mybatis.dto.Master;
import com.mybatis.mappers.FabricMapper;
import com.mybatis.mappers.MasterMapper;
import java.util.List;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Стас
 */
@Service
public class MybatisServices {
    
    @Autowired
    SqlSessionFactory sqlSessionFactory;
    
    public Fabric getFabric(int id){
        
        FabricMapper fabricMapper = sqlSessionFactory.openSession().getMapper(FabricMapper.class);
        Fabric fabric = fabricMapper.getFabricById(id);
        
        return fabric;
        
    }
    
    public List<Master> getMasters(int id){
        
        MasterMapper masterMapper = sqlSessionFactory.openSession().getMapper(MasterMapper.class);
        List<Master> masters = masterMapper.getMasterByFabricID(id);
        
        return masters;
        
    }
    
    
}
