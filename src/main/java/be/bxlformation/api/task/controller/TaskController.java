package be.bxlformation.api.task.controller;

import be.bxlformation.api.task.model.dto.CreateTaskDto;
import be.bxlformation.api.task.model.entity.Task;
import be.bxlformation.api.task.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {


    public TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/task/hello")
    public String say(){
        return "Hello";
    }


    @GetMapping("task/all")
    public Task[] get(){

        return taskService.all().toArray(new Task[0]);}
    @GetMapping("/task/{id}")
    public Task get(@PathVariable("id") long id){
        return taskService.get(id);
    }

    @PostMapping("/task/create")
    public void create(@RequestBody CreateTaskDto taskDto){

        Task t = new Task(taskDto.getDescription(),taskDto.getUrgency(),taskDto.getDeadline());

        this.taskService.add(t);
    }
}
