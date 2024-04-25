package com.example.SpringBoot.MongoDB.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Document
@Data
@ToString
public class Tasks {
 
	@Id
	private String taskid;
	
	private String taskDescription;
	
	private int  severity; // for Mongo repo
	
	private String assignee; // for Mongo repo
	
	private int storyPoint;
	
}
