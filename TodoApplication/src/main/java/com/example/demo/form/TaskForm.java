package com.example.demo.form;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TaskForm {

    private int typeId;
	private String title;
	private String detail;
	private LocalDateTime deadline;
	private boolean newTask;

}
