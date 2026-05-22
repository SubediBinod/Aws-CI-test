package com.binod.Aws_hadson;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class MyController {

    @GetMapping("/greet")
    ResponseEntity<?> greet() {
        return ResponseEntity.ok("Hello from AWS Hadson!");
    }
}
