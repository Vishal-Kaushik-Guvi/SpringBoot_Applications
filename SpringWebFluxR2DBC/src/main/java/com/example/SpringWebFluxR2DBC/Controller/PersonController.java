package com.example.SpringWebFluxR2DBC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.SpringWebFluxR2DBC.Entity.Person;
import com.example.SpringWebFluxR2DBC.Service.PersonService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
public class PersonController {

@Autowired
private PersonService personService;

@PostMapping("/create")
public Mono<Person> createPerson(@RequestBody Person person){
    return personService.createPerson(person);
}

@GetMapping("/findall")
public Flux<Person> findAllPerson(){
    return personService.getAllPerson();
}

@GetMapping("/find/{id}")
public Mono<Person> findPersonById(@PathVariable long id){
    return personService.getPersonById(id);
}

@DeleteMapping("/delete/{id}")
public Mono<Void> deletePersonById(@PathVariable long id){
    return personService.deletePersonByid(id);
}

@PutMapping("/update/{id}")
public Mono<Person> updatePersonById(@PathVariable long id, @RequestBody Person person){
    return personService.updateById(id, person);
}
}
