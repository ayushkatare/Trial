package com.example.controller;


import com.example.model.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {


    @Autowired
    private PersonService personService;


    @RequestMapping(value = "/persons")
    public List<Person> retrieveDetailsOfAllStudents() {
        return personService.retrieveAllStudents();
    }

    @RequestMapping(value = "/persons/{id}")
    public Person retrieveDetailsOfAStudent(@PathVariable int id){
        return personService.retrieveStudent(id);
    }
}
