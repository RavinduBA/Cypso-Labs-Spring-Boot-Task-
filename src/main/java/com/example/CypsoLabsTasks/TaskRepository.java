package com.example.CypsoLabsTasks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task ,Long> {
}
