package ru.platform.learning.databasehandler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.platform.learning.databasehandler.entity.JavaFile;


public interface JavaFileRepository extends JpaRepository<JavaFile, Long> {

}
