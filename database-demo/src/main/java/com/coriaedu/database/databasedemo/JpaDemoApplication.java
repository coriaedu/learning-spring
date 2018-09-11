package com.coriaedu.database.databasedemo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coriaedu.database.databasedemo.entity.Person;
import com.coriaedu.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(JpaDemoApplication.class);

    @Autowired
    PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        logger.info("User id 10001 -> {}", repository.findById(10001));

        logger.info("All users -> {}", repository.findAll());

        logger.info("Deleting id 10002 -> Rows Deleted: {}", repository.deleteById(10002));

        logger.info("Inserting new Person -> Rows Inserted: {}",
                repository.insert(new Person("Scott Summers", "Alaska", new Date())));

        logger.info("Updating id 10001 -> Rows Updated: {}",
                repository.update(new Person(10001, "Eduardo", "San Jose",
                        new GregorianCalendar(1976, Calendar.FEBRUARY, 13).getTime())));

        logger.info("All users -> {}", repository.findAll());
    }
}
