package ru.platform.learning.databasehandler.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.platform.learning.databasehandler.entity.LogFile;
import ru.platform.learning.databasehandler.entity.User;
import ru.platform.learning.databasehandler.service.LogFileService;
import ru.platform.learning.databasehandler.service.UserService;

import java.util.Date;
import java.util.List;

@Service
@EnableScheduling
@Slf4j
public class CleaningRepoService {
    @Autowired
    private UserService userService;
    @Autowired
    private LogFileService logFileService;


    @Scheduled(cron = "0 0 1 * * ?")//раз в сутки 01:00
    public void clearUserRepo(){
        List<User> users = userService.getSomeFieldsEmpty();
        if (users.isEmpty()){
            log.info("List techUser is Empty");
            return;
        }

        users.forEach(user -> {
            log.info("Удален {} время для авторизации закончилось", user);
            userService.deleteUser(user.getId());
        });

    }
    @Scheduled(cron = "0 0 1 * * ?")//раз в сутки 01:00
    public void clearLogFileRepo(){
        List<LogFile> logFiles = logFileService.getExpiredDate(new Date());
        if (logFiles.isEmpty()){
            log.info("List logFiles is Empty");
            return;
        }

        logFiles.forEach(logFile -> {
            log.info("Удален {} время для авторизации закончилось", logFile);
            userService.deleteUser(logFile.getId());
        });

    }

}
