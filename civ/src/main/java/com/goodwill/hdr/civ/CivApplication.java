package com.goodwill.hdr.civ;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.goodwill.hdr.clinical_common.feign")
@MapperScan("com.goodwill.**.mapper")
public class CivApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(CivApplication.class, args);
       while (true){
//           String url = applicationContext.getEnvironment().getProperty("spring.datasource.url");
           String url=applicationContext.getEnvironment().getProperty("spring.datasource.dynamic.datasource.master.url");
           System.out.println(url);
           TimeUnit.SECONDS.sleep(1);
       }

    }
}
