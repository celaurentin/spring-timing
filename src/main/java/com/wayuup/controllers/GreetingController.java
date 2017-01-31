package com.wayuup.controllers;

/**
 * Created by claurentin on 23/1/17.
 */

import com.wayuup.views.GreetingsView;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/greeting")
  public GreetingsView greeting(@RequestParam(value="name", defaultValue="World") String name) {
    return new GreetingsView (counter.incrementAndGet(),
        String.format(template, name));
  }
}