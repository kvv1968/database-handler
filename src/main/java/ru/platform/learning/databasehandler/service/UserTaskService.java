package ru.platform.learning.databasehandler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.platform.learning.databasehandler.entity.UserTask;
import ru.platform.learning.databasehandler.model.LessonTopic;
import ru.platform.learning.databasehandler.repository.UserTaskRepository;

import java.util.List;

@Service
@Slf4j
public class UserTaskService {

    @Autowired
    private UserTaskRepository userTaskRepository;



}
