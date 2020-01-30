package com.persoff68.fatodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FaToDoConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaToDoConfigServiceApplication.class, args);
    }

}
