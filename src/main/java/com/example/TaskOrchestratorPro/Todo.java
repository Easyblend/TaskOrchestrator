package com.example.TaskOrchestratorPro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date;
    private String title;
    private String description;
    private String status;

    public Todo(Date date, String title, String description, String status) {
        this.date = date;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public Todo() {
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(date, todo.date) && Objects.equals(title, todo.title) && Objects.equals(description, todo.description) && Objects.equals(status, todo.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, title, description, status);
    }
}
