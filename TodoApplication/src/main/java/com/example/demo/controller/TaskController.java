package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.model.Task;
import com.example.demo.domain.service.TaskService;
import com.example.demo.form.TaskForm;

@Controller
@RequestMapping("task")
public class TaskController {

	@Autowired
	TaskService taskService;

	@Autowired
	private ModelMapper modelMapper;

	@GetMapping
	public String getTodoList(@ModelAttribute TaskForm form, Model model) {

		//新規登録か更新かを判断する仕掛け
		form.setNewTask(true);

		List<Task> taskList = taskService.findAllTask();
		model.addAttribute("taskList", taskList);

		return "task/taskList";
	}

	@PostMapping("/insert")
	public String insertTask(@ModelAttribute TaskForm taskForm,
			Model model) {

		Task task = modelMapper.map(taskForm, Task.class);

		//		Task task = new Task();
		//		task.setUserId(1);
		//		task.setTypeId(taskForm.getTypeId());
		//		task.setTitle(taskForm.getTitle());
		//		task.setDetail(taskForm.getDetail());
		//		task.setDeadline(taskForm.getDeadline());

		taskService.insertTask(task);

		return "redirect:/task";
	}

	@GetMapping("/{id}")
	public String getOneTask(TaskForm form,
			@PathVariable int id,
			Model model) {

		Task task = taskService.findOneTask(id);

		form = modelMapper.map(task, TaskForm.class);

		model.addAttribute("taskList", task);
		model.addAttribute("taskId", id);
		model.addAttribute("taskForm", form);

		return "task/taskList";
	}

	@PostMapping("/update")
	public String updateTask(@ModelAttribute TaskForm taskForm,
			@RequestParam("taskId") int taskId,
			Model model,
			RedirectAttributes redirectAttributes) {

		Task task = new Task();
		task.setId(taskId);
		task.setUserId(1);
		task.setTypeId(taskForm.getTypeId());
		task.setTitle(taskForm.getTitle());
		task.setDetail(taskForm.getDetail());
		task.setDeadline(taskForm.getDeadline());

		taskService.updateTask(task);

		redirectAttributes.addFlashAttribute("complete", "変更が完了しました");
		return "redirect:/task/" + taskId;

	}

	@PostMapping("/delete")
	public String deleteTask(@RequestParam("taskId") int id,
			Model model,
			RedirectAttributes redirectAttributes) {

		taskService.deleteTask(id);

		redirectAttributes.addFlashAttribute("complete", "タスクを削除しました");
		return "redirect:/task";
	}

}
