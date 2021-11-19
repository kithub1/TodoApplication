package com.example.demo.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.model.Task;
import com.example.demo.domain.service.TaskService;
import com.example.demo.repository.TaskMapper;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskMapper taskMapper;

	@Override
	public List<Task> findAllTask() {
		return taskMapper.findAllTask();
	}

	@Override
	public void insertTask(Task task) {
		taskMapper.insertTask(task);
	}

	@Override
	public Task findOneTask(int id) {
		return taskMapper.findOneTask(id);
	}

}
