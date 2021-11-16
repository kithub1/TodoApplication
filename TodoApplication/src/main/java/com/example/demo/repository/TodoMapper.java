package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.model.Todo;



@Mapper
public interface TodoMapper {

	public List<Todo> selectIncomplete();

	public List<Todo> selectComplete();

}
