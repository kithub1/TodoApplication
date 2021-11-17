package com.example.demo.domain.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Task {

	private int id;
	private int userId;
	private String title;
	private String detail;
	private String type;
	private LocalDateTime deadline;

}
