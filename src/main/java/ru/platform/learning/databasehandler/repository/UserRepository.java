package ru.platform.learning.databasehandler.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import ru.platform.learning.databasehandler.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByFirstNameIsNullAndLastNameIsNullAndEmailIsNullAndPhoneIsNull();
}
