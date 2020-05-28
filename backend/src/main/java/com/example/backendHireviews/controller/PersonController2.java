package com.example.backendHireviews.controller;
import com.example.backendHireviews.model.Person2;
import com.example.backendHireviews.repository.PersonRepository2;
import com.example.backendHireviews.service.PersonService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class PersonController2
{

    @Autowired

    private PersonService2 personService2;

    @Autowired
    private PersonRepository2 personRepository2;

    @RequestMapping("/createJobs")
    public String create
            (@RequestParam String email,@RequestParam String jobTitle,@RequestParam String jobType,@RequestParam String jobDescription,
             @RequestParam String companyName,@RequestParam String companyDescription,@RequestParam String companyWebsite,
             @RequestParam String fbUsername,@RequestParam String ldUsername,@RequestParam String stipend,
             @RequestParam String salary, @RequestParam String jobLocation
            ,@RequestParam String rate,
             @RequestParam  String skills,
            @RequestParam String benefits,
            @RequestParam String experience)
    {
        Person2 p=personService2.create(email,jobTitle,jobType,jobDescription,companyName,companyDescription
                ,companyWebsite,fbUsername,ldUsername,stipend,salary,jobLocation,rate,skills,benefits,experience);
        return p.toString();
    }
    @RequestMapping(method= RequestMethod.POST, value="/createJobs")
    public String create(@RequestBody Person2 person)
    {
        personService2.create(person);
        return ("Hi, "+person.getEmail()+" you have been registered!");
    }


    @RequestMapping("/get1/{email}")
    public Person2 getPerson(@PathVariable String email)
    {
        return personRepository2.findByEmail(email);
    }

    @RequestMapping("/get2/{jobLocation}")
    public List<Person2> getPerson1(@PathVariable String jobLocation)
    {
        return personRepository2.findByJobLocationIgnoreCase(jobLocation);
    }



    @RequestMapping("/getJobs")
    public List<Person2> getAllPerson()
    {
        return personService2.getAll();
    }
    @RequestMapping("/update")
    public String update
            (@RequestParam String email,@RequestParam String jobTitle,@RequestParam String jobType,@RequestParam String jobDescription,
             @RequestParam String companyName,@RequestParam String companyDescription,@RequestParam String companyWebsite,
             @RequestParam String fbUsername,@RequestParam String ldUsername,@RequestParam String stipend,
             @RequestParam String salary, @RequestParam String jobLocation,@RequestParam String rate,
             @RequestParam  String skills,
             @RequestParam String benefits,
             @RequestParam String experience)
    {
        Person2 p=personService2.update(email,jobTitle,jobType,jobDescription,companyName,companyDescription
                ,companyWebsite,fbUsername,ldUsername,stipend,salary,jobLocation,rate,skills,benefits,experience);
        return p.toString();
    }
    @RequestMapping("/delete")
    public String delete(@RequestParam String email)
    {
        personService2.delete(email);
        return "Deleted "+ email;
    }
    @RequestMapping("/deleteAll")
    public String deleteAll()
    {
        personService2.deleteAll();
        return "Deleted All Records!";
    }


}
