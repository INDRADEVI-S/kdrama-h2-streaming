package com.example.kdrama.models;

import jakarta.persistence.*;

@Entity
public class Kdrama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;

    @Column(length = 1000)
    private String description;

    private String thumbnailUrl;
    private String trailerUrl;

    public Kdrama() {}

    public Kdrama(String title, String genre, String description, String thumbnailUrl, String trailerUrl) {
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.thumbnailUrl = thumbnailUrl;
        this.trailerUrl = trailerUrl;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public String getDescription() { return description; }
    public String getThumbnailUrl() { return thumbnailUrl; }
    public String getTrailerUrl() { return trailerUrl; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setDescription(String description) { this.description = description; }
    public void setThumbnailUrl(String thumbnailUrl) { this.thumbnailUrl = thumbnailUrl; }
    public void setTrailerUrl(String trailerUrl) { this.trailerUrl = trailerUrl; }
}
