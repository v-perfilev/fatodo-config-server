package com.persoff68.fatodo;

import com.persoff68.fatodo.config.AppProfileUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.util.Properties;

@SpringBootApplication
@EnableConfigServer
public class FaToDoConfigServerApplication {

    public static void main(String[] args) {
        Properties defaultProfileProperties = AppProfileUtil.getDefaultProfile();
        SpringApplication app = new SpringApplication(FaToDoConfigServerApplication.class);
        app.setDefaultProperties(defaultProfileProperties);
        app.run(args);
    }

}
