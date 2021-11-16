package com.example.demo.form;

import lombok.Data;

@Data
public class TodoForm {

	private long id;
	private String title;
	private int done_flg;
	private String time_limit;

}
