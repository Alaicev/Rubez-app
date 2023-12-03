package ru.altarev123456.Rubez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.altarev123456.Rubez.entity.Images;

import java.util.List;

@Repository
public interface ImagesRepository extends JpaRepository<Images, Long> {

    @Query(value = "SELECT TIMAGES.ID AS IMAGE_ID, TIMAGES.NAME_IMAGE, TNEWS.ID AS NEWS_ID, TNEWS.TEXT_NEWS, TNEWS.TITLE_NEWS FROM TIMAGES INNER JOIN TNEWS_IMAGES_NEWS ON TIMAGES.ID = TNEWS_IMAGES_NEWS.IMAGES_NEWS_ID INNER JOIN TNEWS ON TNEWS.ID = TNEWS_IMAGES_NEWS.NEWS_ID WHERE TNEWS.id = ?1" ,nativeQuery = true)
    List<Images> getAllImagesBuNews (Long id);
}
