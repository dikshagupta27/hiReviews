package com.example.backendHireviews.controller;
import com.example.backendHireviews.model.Person3;
import com.example.backendHireviews.service.PersonService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PersonController3
{
    @Autowired
    private PersonService3 personService3;

    @RequestMapping("/create1")
    public String create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email,@RequestParam String contact, @RequestParam String password,@RequestParam String location)
    {
        Person3 p=personService3.create(firstName,lastName,email,contact,password,location);
        return p.toString();
    }
    @RequestMapping(method= RequestMethod.POST, value="/create1")
    public String create(@RequestBody Person3 person)
    {
        personService3.create(person);
        return ("Hi, "+person.getFirstName()+" "+person.getLastName()+" you have been registered!");
    }
    @RequestMapping("/get1")
    public Person3 getPerson(@RequestParam String firstName)
    {
        return personService3.findByFirstName(firstName);
    }
    @RequestMapping("/getAll")
    public List<Person3> getAllPerson()
    {
        return personService3.getAll();
    }
    @RequestMapping("/update1")
    public String update
            (@RequestParam String firstName, @RequestParam String lastName,@RequestParam String email,@RequestParam String contact, @RequestParam String password,@RequestParam String location)
    {
        Person3 p1=personService3.update(firstName, lastName,email, contact,password,location);
        return p1.toString();
    }
    @RequestMapping("/delete1")
    public String delete(@RequestParam String firstName)
    {
        personService3.delete(firstName);
        return "Deleted "+ firstName;
    }
    @RequestMapping("/deleteAll1")
    public String deleteAll()
    {
        personService3.deleteAll();
        return "Deleted All Records!";
    }
}
