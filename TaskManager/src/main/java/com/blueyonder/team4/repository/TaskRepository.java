package com.blueyonder.team4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.team4.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
	
}
