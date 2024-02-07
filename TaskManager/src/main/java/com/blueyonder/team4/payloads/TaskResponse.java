package com.blueyonder.team4.payloads;

import java.util.List;

import lombok.Data;
@Data
public class TaskResponse {
	private List<TaskDTO> content;
	
}
