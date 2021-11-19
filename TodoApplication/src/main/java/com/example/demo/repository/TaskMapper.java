package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.model.Task;

@Mapper
public interface TaskMapper {

	public List<Task> findAllTask();

	void insertTask(Task task);

}
