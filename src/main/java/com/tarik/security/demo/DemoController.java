package com.tarik.security.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demo-controller")
public class DemoController {
    private final DemoService demoService;
    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from secured endpoint.");
    }
    @GetMapping("/error")
    public ResponseEntity<?> throwException(){
        return ResponseEntity.ok(demoService.throwException());
    }
}
