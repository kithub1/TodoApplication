package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.model.Task;
import com.example.demo.domain.service.TaskService;
import com.example.demo.form.TaskForm;

@Controller
@RequestMapping("task")
public class TaskController {

	@Autowired
	TaskService taskService;

	@GetMapping("/list")
	public String todoList(@ModelAttribute TaskForm form, Model model) {

		List<Task> taskList = taskService.selectAllTask();
		model.addAttribute("taskList", taskList);

		return "task/taskList";
	}

}
