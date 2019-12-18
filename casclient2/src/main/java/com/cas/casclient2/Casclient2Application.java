package com.cas.casclient2;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动CAS@EnableCasClient
@EnableCasClient
@SpringBootApplication
public class Casclient2Application {

    public static void main(String[] args) {
        SpringApplication.run(Casclient2Application.class, args);
    }

}
