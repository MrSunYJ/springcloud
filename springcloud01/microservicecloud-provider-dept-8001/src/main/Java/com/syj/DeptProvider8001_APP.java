package com.syj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author SYJ
 * @description: TODO
 * @date 2020/1/17
 */
@SpringBootApplication
@EnableEurekaClient   // 本服务启动后悔自动注入进eureka服务中
public class DeptProvider8001_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_APP.class, args);
    }
}
