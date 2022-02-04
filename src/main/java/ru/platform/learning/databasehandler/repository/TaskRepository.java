package ru.platform.learning.databasehandler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.platform.learning.databasehandler.entity.TaskTemplate;

import java.util.List;


public interface TaskRepository extends JpaRepository<TaskTemplate, Long> {



}
