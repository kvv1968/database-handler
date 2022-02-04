package ru.platform.learning.databasehandler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.platform.learning.databasehandler.repository.TaskRepository;

import java.util.List;

@Service
@Transactional
@Slf4j
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;


}
