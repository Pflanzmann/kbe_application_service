package com.kbe.application.model;

import java.util.UUID;

public class GifInformation {

    private UUID id;
    private String title;
    private String author;
    private String description;
    private String topic;

    public GifInformation(UUID id, String title, String author, String description, String topic) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.topic = topic;
    }

    public GifInformation(UUID id) {
        this.id = id;
    }

    public GifInformation() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
