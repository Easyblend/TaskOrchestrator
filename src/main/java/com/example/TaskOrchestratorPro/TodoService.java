package com.example.TaskOrchestratorPro;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TodoService {

    private final TodoRespository todoRespository;


    public TodoService(TodoRespository todoRespository) {
        this.todoRespository = todoRespository;
    }

    public List<Todo> listTodos(){
        return todoRespository.findAll();
    }


    public void addTodo(Todo todo) {
        todoRespository.save(todo);
    }

    public Todo getTodoById(Integer id) {
        return todoRespository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo with id " + id + " not found" ));
    }

    public void updateTodo(Todo todo, Integer id) {
        if(todoRespository.existsById(id)){
            todo.setId(id);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo not found");
        }
        todoRespository.save(todo);
    }

    public void deleteTodoById(Integer id){
        todoRespository.deleteById(id);
    }

}
