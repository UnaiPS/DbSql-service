package com.springboot.app.dbsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.springboot.app.commons.models.entity"})
public class DbSqlServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbSqlServiceApplication.class, args);
	}

}
