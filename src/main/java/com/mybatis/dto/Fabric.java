/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.dto;

import java.util.List;
import lombok.Data;

/**
 *
 * @author Стас
 */
@Data
public class Fabric {

    private int id;

    private String name;

    private List<Master> masters;

    private List<Adress> adress;

}
