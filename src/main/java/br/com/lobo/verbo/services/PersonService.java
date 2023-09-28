package br.com.lobo.verbo.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.lobo.verbo.model.Person;

@Service
public class PersonService {
    
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    //metodo
    public Person findById(String id){
        logger.info("Finding one person");

        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("CArlos");
        person.setLastName("Silva");
        person.setAddress("R Aurora 489");
        person.setGender("Mala");
        
        return person;
    }

}
