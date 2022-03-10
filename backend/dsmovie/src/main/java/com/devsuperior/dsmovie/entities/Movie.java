package com.devsuperior.dsmovie.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_movie")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;
}
