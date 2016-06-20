/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.mappers;

import com.mybatis.dto.Detail;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author Стас
 */
@Mapper
public interface DetailMapper {
    
    List<Detail> getDetailbyMasterId(Integer id);
    
}
