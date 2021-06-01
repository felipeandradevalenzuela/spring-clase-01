package com.example.demo2.helloWorldController;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "<h1>Hola " + name + "!</h1>";
    }
}