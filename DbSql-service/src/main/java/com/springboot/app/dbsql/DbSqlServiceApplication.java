package com.springboot.app.dbsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author Unai Pérez Sánchez
 * 
 * This is the main class of the application
 *
 */
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.springboot.app.commons.models.entity"})
public class DbSqlServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbSqlServiceApplication.class, args);
	}

}
