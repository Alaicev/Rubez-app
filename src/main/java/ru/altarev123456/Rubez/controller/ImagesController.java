package ru.altarev123456.Rubez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.altarev123456.Rubez.entity.Images;
import ru.altarev123456.Rubez.service.ImagesService;

import java.util.List;

@RestController
public class ImagesController {

    @Autowired
    private ImagesService imagesService;

//:TODO Надо удалить потом
    @GetMapping(value = "/hello")
    public String GetHello () {
        return "Hello World";
    }

    @GetMapping(value = "/getImages")
    public List<Images> getAllImagesBuNews (@RequestParam(value = "id") Long id) {
        return imagesService.getAllImagesBuNews(id);
    }

}
