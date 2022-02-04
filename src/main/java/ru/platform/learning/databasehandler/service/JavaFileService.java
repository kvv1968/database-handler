package ru.platform.learning.databasehandler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.platform.learning.databasehandler.repository.JavaFileRepository;

@Service
@Slf4j
public class JavaFileService {
    @Autowired
    private JavaFileRepository repository;


}
