package com.example.demo.domain.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Task {

	private int id;
	private int userId;
	private int typeId;
	private String title;
	private String detail;
	private LocalDateTime deadline;

	private TaskType taskType;

}
