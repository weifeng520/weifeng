package com.wei.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wei
 * @date 2019/12/26
 */
@EnableEurekaClient
@EnableAdminServer
@SpringBootApplication
public class WeiMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeiMonitorApplication.class, args);
    }
}
