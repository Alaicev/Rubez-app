package ru.altarev123456.Rubez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.altarev123456.Rubez.entity.News;
import ru.altarev123456.Rubez.entity.User;
import ru.altarev123456.Rubez.repository.NewsRepository;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public void createNews (News news) {
        newsRepository.save(news);
    }

    public List<News> getAllNews () {
        return newsRepository.findAll();
    }

//    public User getUserBuId (Long id) {
//        return newsRepository.findAllById();
//    }

}
