package com.blueyonder.team4.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name="tasks")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long taskId;
	
	@Column(name="taskName")
	@Size(min=5 ,max=15,message="The length must be between 5 and 15")
	private String taskName;
	 
	@Column(name="taskDescription")
	private String taskDescription;
}	
