package com.example.demo.form;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TaskForm {

	private int id;
	private String title;
	private String detail;
	private String type;
	private LocalDateTime deadline;
	private boolean newTask;

}
