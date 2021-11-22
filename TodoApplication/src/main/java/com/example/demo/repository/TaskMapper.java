package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.model.Task;

@Mapper
public interface TaskMapper {

	public List<Task> findAllTask();

	public void insertTask(Task task);

	public Task findOneTask(int id);

	public void updateTask(Task task);

	public void deleteTask(int id);

}
