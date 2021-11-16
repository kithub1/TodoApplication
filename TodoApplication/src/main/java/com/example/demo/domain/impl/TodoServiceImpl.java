package com.example.demo.domain.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.model.Todo;
import com.example.demo.domain.service.TodoService;
import com.example.demo.repository.TodoMapper;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoMapper todoMapper;

	@Override
	public List<Todo> selectIncomplete() {
		return todoMapper.selectIncomplete();
	}

	@Override
	public List<Todo> selectComplete() {
		return todoMapper.selectComplete();
	}

}
