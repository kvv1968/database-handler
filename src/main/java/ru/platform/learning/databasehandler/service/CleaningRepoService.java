package ru.platform.learning.databasehandler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.platform.learning.databasehandler.client.MainClient;


@Service
@EnableScheduling
@Slf4j
public class CleaningRepoService {
    @Autowired
    private MainClient mainClient;


    @Scheduled(cron = "0 0 1 * * ?")//раз в сутки 01:00
    public void clearUserRepo(){
        mainClient.startCleanRepo();
    }


}
