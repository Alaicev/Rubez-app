package ru.altarev123456.Rubez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.altarev123456.Rubez.entity.Images;
import ru.altarev123456.Rubez.repository.ImagesRepository;

import java.util.List;

@Service
public class ImagesService {

    @Autowired
    private ImagesRepository imagesRepository;

    public List<Images> getAllImagesBuNews (Long id) {
        return imagesRepository.getAllImagesBuNews(id);
    }

}
