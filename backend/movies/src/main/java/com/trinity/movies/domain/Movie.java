package com.trinity.movies.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "enable")
    private String enable;
}
