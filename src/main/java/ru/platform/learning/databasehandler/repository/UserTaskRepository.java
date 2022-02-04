package ru.platform.learning.databasehandler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.platform.learning.databasehandler.entity.UserTask;

import java.util.List;

public interface UserTaskRepository extends JpaRepository<UserTask, Long> {



}
