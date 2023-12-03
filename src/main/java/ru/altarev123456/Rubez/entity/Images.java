package ru.altarev123456.Rubez.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TIMAGES")
@Getter @Setter @EqualsAndHashCode @ToString
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameImage;
}
