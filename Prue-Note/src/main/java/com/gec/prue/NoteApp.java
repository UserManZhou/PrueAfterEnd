package com.gec.prue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NoteApp {
    public static void main(String[] args) {
        SpringApplication.run(NoteApp.class, args);
    }
}
