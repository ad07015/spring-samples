package com.example.demo.controller;

import com.example.demo.model.Race;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class RaceController {

    @GetMapping("/id/{id}")
    public Race getRaceById(@PathVariable long id) {
        return new Race(id, Calendar.getInstance().getTime());
    }
}
