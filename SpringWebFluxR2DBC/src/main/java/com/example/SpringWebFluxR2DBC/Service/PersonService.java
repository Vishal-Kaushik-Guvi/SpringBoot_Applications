package com.example.SpringWebFluxR2DBC.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringWebFluxR2DBC.Entity.Person;
import com.example.SpringWebFluxR2DBC.Repository.PersonRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonService {

@Autowired
private PersonRepo personRepo;

public Mono<Person> createPerson(Person person){
    return personRepo.save(person);
}

public Flux<Person> getAllPerson(){
    return personRepo.findAll();
}

public Mono<Person> getPersonById(long id){
    return personRepo.findById(id);
}

public Mono<Void> deletePersonByid(long id){
    return personRepo.deleteById(id);
}

public Mono<Person> updateById(long id, Person person) {
     return  personRepo.findById(id)
            .flatMap(existingPerson -> {
                existingPerson.setName(person.getName());
                existingPerson.setAge(person.getAge());
                return personRepo.save(existingPerson);
            });
        }
}
