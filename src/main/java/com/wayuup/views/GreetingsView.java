package com.wayuup.views;

/**
 * Created by claurentin on 30/1/17.
 */
public class GreetingsView extends AbstractView{

    private final long id;
    private final String content;

    public GreetingsView(long id, String content) {
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
