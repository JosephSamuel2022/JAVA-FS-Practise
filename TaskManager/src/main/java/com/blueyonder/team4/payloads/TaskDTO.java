package com.blueyonder.team4.payloads;

import lombok.Data;

@Data
public class TaskDTO {
	private Long taskId;
	private String taskName;
	private String taskDescription;
	
}
