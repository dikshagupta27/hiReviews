package com.example.backendHireviews.service;

import com.example.backendHireviews.model.Person3;
import com.example.backendHireviews.repository.personRepository3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService3
{
    @Autowired
    private personRepository3 personRepository03;
    //createOperation
    public Person3 create(String firstName, String lastName, String email, String contact,String password,String location)
    {
        return personRepository03.save(new Person3(firstName,lastName,email,contact,password,location));
    }
    public String create(Person3 person)     //POST
    {
        personRepository03.save(person);
        return ("Hi, "+person.getFirstName()+" "+person.getLastName()+" you have been registered");
    }
    //retrieveOperation
    public List<Person3> getAll()
    {
        return personRepository03.findAll();

    }

    public Person3 findByFirstName(String firstName)
    {
        return personRepository03.findByFirstName(firstName);
    }

    //UpdateOperation
    public Person3 update(String firstName, String lastName, String email, String contact,String password,String location)
    {
        Person3 p=personRepository03.findByFirstName(firstName);
        p.setLastName(lastName);
        p.setEmail(email);
        p.setContact(contact);
        p.setPassword(password);
        p.setLocation(location);
        return personRepository03.save(p);
    }
    //DeleteOperation
    public void deleteAll(){
        personRepository03.deleteAll();
    }
    public void delete(String firstName)
    {
        Person3 p=personRepository03.findByFirstName(firstName);
        personRepository03.delete(p);
    }
}
