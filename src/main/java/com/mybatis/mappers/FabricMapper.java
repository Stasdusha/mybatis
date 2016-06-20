/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.mappers;

import com.mybatis.dto.Fabric;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author Стас
 */
@Mapper
public interface FabricMapper {
    
    Fabric getFabricById(Integer id);
    
}
