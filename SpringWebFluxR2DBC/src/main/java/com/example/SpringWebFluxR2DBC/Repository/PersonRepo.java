package com.example.SpringWebFluxR2DBC.Repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringWebFluxR2DBC.Entity.Person;

@Repository
public interface PersonRepo extends R2dbcRepository<Person, Long> {

}