package com.example.service;

import com.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PersonService {

    @Autowired
    JdbcTemplate jdbcTemplate;



    public List<Person> retrieveAllStudents() {
        String sql = "select * from Persons ";
        List<Person>list =  jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(Person.class));
        return list;
    }

    public Person retrieveStudent(int personId) {
        String sql = "select * from Persons where id = ?";
        Person ps = jdbcTemplate.queryForObject(sql,new Object[]{personId},new BeanPropertyRowMapper<>(Person.class));
        return ps;
    }

}
