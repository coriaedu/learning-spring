package com.coriaedu.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coriaedu.database.databasedemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseDemoApplication.class);

    @Autowired
    PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        // fire a query
        logger.info("All users -> {}", dao.findAll());
    }
}
