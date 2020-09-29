package com.tcs.employeeManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EmployeeManagementConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementConfigApplication.class, args);
	}

}
