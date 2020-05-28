package com.example.backendHireviews.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.backendHireviews.model.Person2;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;
@Repository
public interface PersonRepository2 extends MongoRepository<Person2,String>
{
    public Person2 findByEmail(String email);
    //    public Person1 findByJobLocation(String jobLocation);
    public List<Person2> findByJobLocationIgnoreCase(String jobLocation);

}
