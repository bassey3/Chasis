package com.exgnt.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@Configuration
@EnableAutoConfiguration
@EnableConfigServer
@SpringBootApplication
public class ChasisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChasisApplication.class, args);
	}
}
