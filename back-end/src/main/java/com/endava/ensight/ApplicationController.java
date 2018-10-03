package com.endava.ensight;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ApplicationController {

    @GetMapping(value = "/greet")
    public ResponseEntity<String> greetUser() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

}

