package com.example.SpringBoot.MongoDB.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.SpringBoot.MongoDB.Entity.Tasks;

public interface TaskRepository extends MongoRepository<Tasks, String> {
	
	List<Tasks> findBySeverity(int taskSeverity);
	
	@Query("{assignee:?0}")
	List<Tasks> getByAssignee(String assignee);

}
