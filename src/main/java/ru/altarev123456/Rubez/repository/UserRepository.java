package ru.altarev123456.Rubez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import ru.altarev123456.Rubez.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
