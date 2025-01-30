package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  
    // One syntax to implement a
    // GET method
    @GetMapping("/")
    public String home()
    {
        String str
            = "<html><body><font color=\"orange\">"
              + "<h1>WELCOME To My application</h1>"
              + "</font></body></html>";
        return str;
    }
  
    // Another syntax to implement a
    // GET method
    @RequestMapping(
        method = { RequestMethod.GET },
        value = { "/about" })
  
    public String info()
    {
        String str2
            = "<html><body><font color=\"black\">"
              + "<h2>This is the test application"
              + "for testing the maven project pipeline."
              + " I am a software engineer, who likes to"
              + " code but don't like to drink coffee. "
              + "</h2></font></body></html>";
        return str2;
    }
}
