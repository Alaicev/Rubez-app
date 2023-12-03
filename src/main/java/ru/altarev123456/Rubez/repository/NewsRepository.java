package ru.altarev123456.Rubez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.altarev123456.Rubez.entity.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
}
