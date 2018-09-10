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
        logger.info("User id 10001 -> {}", dao.findById(10001));
        logger.info("Users with Pedro name -> {}", dao.findByName("Pedro"));
        logger.info("User from San Jose -> {}", dao.findByLocation("San Jose"));

        logger.info("Deleting id 10002 -> Number of Rows Deleted: {}", dao.deleteById(10002));
    }
}
