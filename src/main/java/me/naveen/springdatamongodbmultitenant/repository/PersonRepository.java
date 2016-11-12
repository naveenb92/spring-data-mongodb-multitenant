package me.naveen.springdatamongodbmultitenant.repository;

import me.naveen.springdatamongodbmultitenant.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Naveen Babu on 12-08-2016.
 */
public interface PersonRepository extends MongoRepository<Person,String> {
}
