package com.liuxc.www.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author L
 * @date 2018/12/27 - 14:59
 */
@SpringBootApplication
@EnableZipkinServer
public class Sleuth_8501_StartSpringCloudApplication {
    public static void main(String[] args) {

        SpringApplication.run(Sleuth_8501_StartSpringCloudApplication.class, args);
    }
}



