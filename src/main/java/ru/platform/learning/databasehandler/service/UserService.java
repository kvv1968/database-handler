package ru.platform.learning.databasehandler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.platform.learning.databasehandler.entity.User;
import ru.platform.learning.databasehandler.repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getSomeFieldsEmpty() {
        return userRepository.findAllByFirstNameIsNullAndLastNameIsNullAndEmailIsNullAndPhoneIsNull();
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }





}
