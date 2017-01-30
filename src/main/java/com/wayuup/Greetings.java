package com.wayuup;

/**
 * Created by claurentin on 23/1/17.
 */
public class Greetings {

    private final long id;
    private final String content;

    public Greetings(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
