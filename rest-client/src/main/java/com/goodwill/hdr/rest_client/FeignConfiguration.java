package com.goodwill.hdr.rest_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication

public class RestClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestClientApplication.class, args);
    }

}
