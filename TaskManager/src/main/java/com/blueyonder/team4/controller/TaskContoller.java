package com.blueyonder.team4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.team4.entities.Task;
import com.blueyonder.team4.service.TaskService;

@RestController 
@RequestMapping("/taskapi")
public class TaskContoller {
	@Autowired 
	TaskService taskService;
	
	public void setData(Task task) {
		taskService.set(task);
	}
}
