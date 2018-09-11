package com.coriaedu.database.databasedemo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.coriaedu.database.databasedemo.entity.Person;

// Repository
@Repository
// Transaction
@Transactional
public class PersonJpaRepository {

    // Connect to the database  (In JDBC we'd use JDBCTemplate autowired)
    @PersistenceContext
    EntityManager entityManager;

    // methods for data retrieval using JPA
    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }

    public Person insert(Person person) {
        return update(person);
    }

    public Person deleteById(int id) {
        Person person = findById(id);
        entityManager.remove(person);
        return person;
    }
}
