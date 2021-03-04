package com.yun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaServiceApplicationSupport {
    public static void main(String args[]){
        SpringApplication.run(EurekaServiceApplicationSupport.class,args);
    }
}
