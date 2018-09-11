package com.coriaedu.database.databasedemo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.coriaedu.database.databasedemo.entity.Person;
import com.coriaedu.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(SpringJdbcDemoApplication.class);

    @Autowired
    PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        // fire a query
        logger.info("All users -> {}", dao.findAll());
        logger.info("User id 10001 -> {}", dao.findById(10001));
        logger.info("Users with Pedro name -> {}", dao.findByName("Pedro"));
        logger.info("User from San Jose -> {}", dao.findByLocation("San Jose"));

        logger.info("Deleting id 10002 -> Number of Rows Deleted: {}", dao.deleteById(10002));

        logger.info("Inserting id 1004 -> Number of Rows Inserted: {}",
                dao.insert(new Person(10004, "Scott Summers", "Alaska", new Date())));

        logger.info("Updating id 1001 -> Number of Rows Updated: {}",
                dao.update(new Person(10001, "Eduardo", "San Jose",
                        new GregorianCalendar(1976, Calendar.FEBRUARY, 13).getTime())));
    }
}
