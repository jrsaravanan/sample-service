package com.example.demo.resource;

import com.example.demo.vo.Message;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SampleService {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World";
    }

    @GetMapping(value = "/msg", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
    public ResponseEntity<?> message() {
        Message msg = new Message("Hello, World");
        return  ResponseEntity.ok(msg);
    }
}
