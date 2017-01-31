package com.wayuup.views;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by claurentin on 30/1/17.
 */
public class AbstractView {

    @JsonIgnore
    private String version;

    public String getVersion() {
      return version;
    }

    public void setVersion(String version) {
      this.version = version;
    }
}

