package com.example.backendHireviews.repository;
import com.example.backendHireviews.model.Person3;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface personRepository3 extends MongoRepository<Person3,String>
{
    public Person3 findByFirstName(String firstName);
    // public List<Person> findByAge(int age);
}

