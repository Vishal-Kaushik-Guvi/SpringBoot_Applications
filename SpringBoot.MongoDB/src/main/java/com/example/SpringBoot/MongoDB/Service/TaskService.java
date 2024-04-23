package com.example.SpringBoot.MongoDB.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.MongoDB.Entity.Tasks;
import com.example.SpringBoot.MongoDB.Repository.TaskRepository;

@Service
public class TaskService {
	
  @Autowired
  TaskRepository taskrepo;
  
  public Tasks addTask(Tasks task) {
	  task.setTaskid(UUID.randomUUID().toString().split("-")[0]);
	  return taskrepo.save(task);
  }
  
  public List<Tasks> findAllTask(){
	  return taskrepo.findAll();
  }
  
  public Tasks findById(String id) {
	  return taskrepo.findById(id).get();
  }
  
//  public List<Tasks> gettaskbySeverity(int Severity){
//	  return taskrepo.findbyseverity(Severity);
//  }
  
  public List<Tasks> findByAssignee(String assignee){
	  return taskrepo.getByAssignee(assignee);
  }
  
  public Tasks UpdateTask(Tasks task) {
	 Tasks updatedtask = taskrepo.findById(task.getTaskid()).get();
	 updatedtask.setTaskAssignee(task.getTaskAssignee());
	 updatedtask.setTaskDescription(task.getTaskDescription());
	 updatedtask.setStoryPoint(task.getStoryPoint());
	 updatedtask.setTaskSeverity(task.getTaskSeverity());
	 
	 return taskrepo.save(updatedtask);
  }
  
  public String DeleteTask(String taskid) {
	  taskrepo.deleteById(taskid);
	  return taskid +"Task Deleted";
  }
}
