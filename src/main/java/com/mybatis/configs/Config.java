/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.configs;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Стас
 */
@Configuration
public class Config {

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws IOException {
        Reader reader = Resources
                .getResourceAsReader("mybatis-config.xml"); //Читаем файл с настройками подключения и настройками MyBatis
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        return sqlSessionFactory;
    }

}
