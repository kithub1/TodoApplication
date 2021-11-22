package com.example.demo.domain.service;

import java.util.List;

import com.example.demo.domain.model.Task;

public interface TaskService {

	public List<Task> findAllTask();

	public void insertTask(Task task);

	public Task findOneTask(int id);

	public void updateTask(Task task);

}
