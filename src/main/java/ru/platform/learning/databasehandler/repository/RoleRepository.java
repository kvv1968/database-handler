package ru.platform.learning.databasehandler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.platform.learning.databasehandler.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {


}
