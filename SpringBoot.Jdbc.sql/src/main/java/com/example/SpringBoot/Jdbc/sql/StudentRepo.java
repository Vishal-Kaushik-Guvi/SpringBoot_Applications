package com.example.SpringBoot.Jdbc.sql;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepo extends JpaRepository<Students, Integer> {
     
//	Students findbyName(String name);
//	
//	Students findbyAddress(String address);
//	
//	Students findbyNameAndAddress(String name, String address);
//	
//	// to get student by name and address
//	
//	@Query("select u from Students u where u = ?1 and u.address = ?2")
//	Students getStudentByNameAndAddress(String name, String address);
//	
//	// to get students by address using @param
//	
//	@Query("select u from students u where u.address like :Address")
//     List<Students> getbyaddress(@Param("Address") String address);
//	
//	// to get student by name or address using @param
//	
//	@Query("select u from students u where u.name = :name or u.address = :address")
//	List<Students> getbyNameOrAddress(@Param("name") String name, @Param("address") String address);
//	
//	// to check student address is not null
//	List<Students> AddressIsNotNull();
//
	}