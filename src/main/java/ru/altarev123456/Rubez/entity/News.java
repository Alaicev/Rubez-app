package ru.altarev123456.Rubez.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "TNEWS")
@Getter @Setter @EqualsAndHashCode @ToString
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titleNews;
    private String textNews;

    @ManyToOne
    private Images titleImages;

    @ManyToMany
    private List<Images> imagesNews;
}
