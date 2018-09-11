package com.coriaedu.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

        //        logger.info("All users -> {}", repository.findAll());
        //        logger.info("Users with Pedro name -> {}", repository.findByName("Pedro"));
        //        logger.info("User from San Jose -> {}", repository.findByLocation("San Jose"));
        //
        //        logger.info("Deleting id 10002 -> Number of Rows Deleted: {}", repository.deleteById(10002));
        //
        //        logger.info("Inserting id 1004 -> Number of Rows Inserted: {}",
        //                repository.insert(new Person(10004, "Scott Summers", "Alaska", new Date())));
        //
        //        logger.info("Updating id 1001 -> Number of Rows Updated: {}",
        //                repository.update(new Person(10001, "Eduardo", "San Jose",
        //                        new GregorianCalendar(1976, Calendar.FEBRUARY, 13).getTime())));
    }
}
