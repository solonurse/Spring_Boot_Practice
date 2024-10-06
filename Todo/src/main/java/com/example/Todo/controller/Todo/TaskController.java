package com.example.Todo.controller.Todo;

import com.example.Todo.entity.TaskEntity;
import com.example.Todo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public String showTasks(Model model) {
        List<TaskEntity> taskList =  taskService.getAllTasks();

        model.addAttribute("taskList", taskList);
        return "task/index";
    }

    @GetMapping("/createForm")
    public String showCreationForm(Model model) {
        model.addAttribute("taskForm", new TaskEntity());
        return "task/form";
    }

    @PostMapping
    public String createTask(@ModelAttribute TaskEntity task) {
        taskService.createTask(task);
        return "task/index";
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "task/index";
    }
}
