package com.example.demo.controller;

import com.example.demo.model.Circuit;
import com.example.demo.repository.CircuitRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/circuit")
public class CircuitController {

    private CircuitRepository circuitRepository;

    public CircuitController(CircuitRepository circuitRepository) {
        this.circuitRepository = circuitRepository;
    }

    @GetMapping
    public List<Circuit> findALl() {
        return circuitRepository.findAll();
    }
}
