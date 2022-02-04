package ru.platform.learning.databasehandler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.platform.learning.databasehandler.entity.LogFile;

import java.util.Date;
import java.util.List;


public interface LogFileRepository extends JpaRepository<LogFile, Long> {

List<LogFile> findAllByExpiredDateLessThan(Date expiredDate);


}
