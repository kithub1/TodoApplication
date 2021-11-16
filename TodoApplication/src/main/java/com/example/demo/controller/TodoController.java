package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.model.Todo;
import com.example.demo.domain.service.TodoService;
import com.example.demo.form.TodoForm;

@Controller
@RequestMapping("todo")
public class TodoController {

	@Autowired
	TodoService todoService;

	@GetMapping("/list")
	public String todoList(@ModelAttribute TodoForm form, Model model) {

		List<Todo> list = todoService.selectIncomplete();
		List<Todo> doneList = todoService.selectComplete();

		model.addAttribute("todos", list);
		model.addAttribute("doneTodos", doneList);

		return "todo/todoList";
	}

}
