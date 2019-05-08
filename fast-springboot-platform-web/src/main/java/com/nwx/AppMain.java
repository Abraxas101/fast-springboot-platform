package com.nwx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.ApplicationContext;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @version : V1.font-awesome
 * @Description: 项目启动
 * @Auther: Neil
 * @Date: 2019/4/23 17:34
 */
@SpringBootApplication
public class AppMain {

    protected static final Logger logger = LoggerFactory.getLogger(AppMain.class);

    private static ApplicationContext ctx;

    public static void main(String[] args) {

        ctx = SpringApplication.run(AppMain.class, args);

        try {
            String host = InetAddress.getLocalHost().getHostAddress();
            TomcatServletWebServerFactory tomcatServletWebServerFactory= (TomcatServletWebServerFactory) ctx.getBean("tomcatServletWebServerFactory");
            int port = tomcatServletWebServerFactory.getPort();
            String contextPath = tomcatServletWebServerFactory.getContextPath();
            logger.info("项目启动成功：http://"+host+":"+port+contextPath+"/index");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
