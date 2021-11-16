package com.example.demo.domain.service;

import java.util.List;

import com.example.demo.domain.model.Todo;

public interface TodoService {

	public List<Todo> selectIncomplete();

	public List<Todo> selectComplete();

}
