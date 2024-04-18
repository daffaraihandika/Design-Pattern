package com.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.singleton.service.DatabaseService;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SingletonApplication.class, args);

		// Mengambil instance DatabaseService dari Spring context
		DatabaseService databaseService = context.getBean(DatabaseService.class);

		// Melakukan koneksi ke database
		databaseService.connectToDatabase();

		// Melakukan disconnect database
		databaseService.disconnectDatabase();
	}
}
