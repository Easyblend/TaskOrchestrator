package com.example.TaskOrchestratorPro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRespository extends JpaRepository<Todo, Integer> {
}
