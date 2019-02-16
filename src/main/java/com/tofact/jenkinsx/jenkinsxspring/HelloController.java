package com.tofact.jenkinsx.jenkinsxspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String index() {
        return "Hello from Spring Boot";
    }
}