package com.nwx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @version : V1.font-awesome
 * @Description: 项目启动
 * @Auther: Neil
 * @Date: 2019/4/23 17:34
 */
@SpringBootApplication
@MapperScan("com.nwx.mapper")
public class AppMain {

    public static void main(String[] args) {

        SpringApplication.run(AppMain.class, args);
    }
}
