package com.wayuup;

/**
 * Created by claurentin on 30/1/17.
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;
import java.sql.SQLException;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DatabaseConfiguration {
  @NotNull
  private String username;

  @NotNull
  private String password;

  @NotNull
  private String url;

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Bean
  DatabaseConfiguration dataSource() throws SQLException {
    DatabaseConfiguration dataSource = new DatabaseConfiguration();
    dataSource.setUsername(username);
    dataSource.setPassword(password);
    dataSource.setUrl(url);
    return dataSource;
  }
}

