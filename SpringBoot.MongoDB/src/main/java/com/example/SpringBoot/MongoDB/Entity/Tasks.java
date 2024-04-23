package com.example.SpringBoot.MongoDB.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tasks {
 
	@Id
	private String taskid;
	
	private String taskDescription;
	
	private int taskSeverity;
	
	private String taskAssignee; 
	
	private int storyPoint;
	
}
