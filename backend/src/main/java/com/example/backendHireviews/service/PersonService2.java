package com.example.backendHireviews.service;



import com.example.backendHireviews.model.Person2;
import com.example.backendHireviews.repository.PersonRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService2
{

    @Autowired
    private PersonRepository2 personRepository2;
    //createOperation
    public Person2 create(String email,String jobTitle,String jobType,String jobDescription,String companyName,
                          String companyDescription,String companyWebsite,String fbUsername,String ldUsername,String stipend,
                          String salary, String jobLocation,String rate,
                          String skills,
                          String benefits,
                          String experience)
    {
        return personRepository2.save(new Person2(email,jobTitle,jobType,jobDescription,companyName,companyDescription
                ,companyWebsite,fbUsername,ldUsername,stipend,salary,jobLocation,rate,skills,benefits,experience));
    }
    public String create(Person2 person)     //POST
    {
        personRepository2.save(person);
        return ("Hi, "+person.getEmail()+" "+person.getCompanyName()+" you have been registered");
    }
    //retrieveOperation
    public List<Person2> getAll()
    {
        return personRepository2.findAll();

    }

    public Person2 findByEmail(String email)
    {
        return personRepository2.findByEmail(email);
    }

    //UpdateOperation
    public Person2 update
    (String email,String jobTitle,String jobType,String jobDescription,String companyName,
     String companyDescription,String companyWebsite,String fbUsername,String ldUsername,String stipend,
     String salary, String jobLocation,String rate,
     String skills,
     String benefits,
     String experience)
    {
        Person2 p=personRepository2.findByEmail(email);
        p.setJobTitle(jobTitle);
        p.setJobType(jobType);
        p.setJobDescription(jobDescription);
        p.setCompanyName(companyName);
        p.setCompanyDescription(companyDescription);
        p.setCompanyWebsite(companyWebsite);
        p.setFbUsername(fbUsername);
        p.setLdUsername(ldUsername);
        p.setSalary(salary);
        p.setJobLocation(jobLocation);
        p.setStipend(stipend);
        p.setSkills(skills);
        p.setRate(rate);
        p.setExperience(experience);
        p.setBenefits(benefits);
        return personRepository2.save(p);
    }
    //DeleteOperation
    public void deleteAll()
    {
        personRepository2.deleteAll();
    }
    public void delete(String email)
    {
        Person2 p=personRepository2.findByEmail(email);
        personRepository2.delete(p);
    }



}
