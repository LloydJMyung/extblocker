package com.assignment.flow.extblocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ExtblockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtblockerApplication.class, args);
	}

}
