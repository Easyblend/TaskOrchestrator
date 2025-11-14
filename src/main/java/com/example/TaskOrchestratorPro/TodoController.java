package com.example.TaskOrchestratorPro;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.listTodos();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable Integer id){
        return todoService.getTodoById(id);
    }

    @PostMapping
    public void addTodo(@RequestBody Todo todo){
        todoService.addTodo(todo);
    }

    @PutMapping("/{id}")
    public void updateTodo(@RequestBody Todo todo, @PathVariable Integer id){
        todoService.updateTodo(todo, id);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable Integer id){
        todoService.deleteTodoById(id);
    }
}
