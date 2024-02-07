package com.blueyonder.team4.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.team4.entities.Task;

import com.blueyonder.team4.repository.TaskRepository;
@Service
public class TaskService {
	@Autowired
	TaskRepository taskRepo;
	
	
	public void set(Task task) {
		taskRepo.save(task);
	}
}
