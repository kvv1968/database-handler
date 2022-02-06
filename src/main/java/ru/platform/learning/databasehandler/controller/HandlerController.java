package ru.platform.learning.databasehandler.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.platform.learning.databasehandler.service.LogService;

@Slf4j
@RestController
@RequestMapping("/api/hand")
public class HandlerController {

    private final LogService logService;
    @Autowired
    public HandlerController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping
    public String health(){
        final String msg = "Service handler status=200";
        log.info(msg);
        return msg;
    }

    @GetMapping("/file.zip")
    public byte[] getCurrentLog(){
        return logService.getCurrentLogFile();
    }

    @GetMapping("/files.zip")
    public byte[] getArchivedLog(){
        return logService.getArchivedDir();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handlerException(Exception ex){
        final String msg = ex.getMessage();
        log.error(msg);
        return ResponseEntity.status(500).body(msg);
    }
}
