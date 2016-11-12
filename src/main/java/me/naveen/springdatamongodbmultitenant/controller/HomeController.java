package me.naveen.springdatamongodbmultitenant.controller;

import me.naveen.springdatamongodbmultitenant.model.Person;
import me.naveen.springdatamongodbmultitenant.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Created by Naveen Babu on 12-08-2016.
 */
@RestController
public class HomeController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void index(@RequestParam(required = false) String db){

        // Inject tenantId in the request
        RequestContextHolder.getRequestAttributes().setAttribute("tenantId",db, RequestAttributes.SCOPE_REQUEST);

        Person person = new Person();
        person.setFirstName("Naveen");

        personService.addPerson(person);
    }

}
