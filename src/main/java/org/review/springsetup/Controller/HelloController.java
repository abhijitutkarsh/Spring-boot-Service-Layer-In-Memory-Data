package org.review.springsetup.Controller;

import jakarta.validation.Valid;
import org.review.springsetup.dto.UserDto;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Hello from Spring boot";
    }

    @PostMapping
    public ResponseEntity<String> createUser(@Valid @RequestBody UserDto userDto)
    {
        return ResponseEntity.ok("User Created " + userDto.getName());
    }
}
