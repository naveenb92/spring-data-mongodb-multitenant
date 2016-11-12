package me.naveen.springdatamongodbmultitenant.service;

import me.naveen.springdatamongodbmultitenant.model.Person;
import me.naveen.springdatamongodbmultitenant.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Naveen Babu on 12-08-2016.
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void addPerson(Person person)
    {
        personRepository.save(person);
    }

    public Person getPerson(String id)
    {
        return personRepository.findOne(id);
    }


}
