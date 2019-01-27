package com.example.service;

import com.example.model.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PersonService {

    private static List<Person> persons = new ArrayList<>();

    static {
        //Initialize Data

        Person ranga = new Person("Student1", 24,
                1);

        Person satish = new Person("Student2", 25,
                2);

        persons.add(ranga);
        persons.add(satish);
    }

    public List<Person> retrieveAllStudents() {
        return persons;
    }

    public Person retrieveStudent(int personId) {
        for (Person person : persons) {
            if (person.getId()==personId) {
                return person;
            }
        }
        return null;
    }

}
