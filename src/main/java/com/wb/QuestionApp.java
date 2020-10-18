package com.wb;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;

/**
 * Create By WeiBin on 2020/2/27 22:27
 * SpringBoot的启动类
 * 测试jenkins自动部署
 * 1
 */
@SpringBootApplication
public class QuestionApp {
    public static void main(String[] args) {
        SpringApplication.run(QuestionApp.class,args);
    }
    public ServletWebServerFactory servletContainer(){
        TomcatServletWebServerFactory tomcat=new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createHTTPConnector());
        return tomcat;
    }

    private Connector createHTTPConnector() {
        Connector connector = new
                Connector("org.apache.coyote.http11.Http11NioProtocol");

        //同时启用http（8080）、https（8443）两个端口
        connector.setScheme("http");
        connector.setSecure(false);
        connector.setPort(8080);
        connector.setRedirectPort(8443);
        return connector;
    }
}
