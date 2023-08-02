package com.example.demo.controller;

import com.example.demo.model.Circuit;
import com.example.demo.repository.CircuitRepository;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/country/{country}")
    public List<Circuit> findAllByCountry(@PathVariable String country) {
        return circuitRepository.findByCountryEquals(country);
    }

    @GetMapping("/name")
    public Circuit findByName(@RequestParam String name) {
        return circuitRepository.findByNameContains(name);
    }

    @GetMapping("/loc")
    public Circuit findByLocation(@RequestParam String n) {
        return circuitRepository.findByLocationEquals(n);
    }

    @GetMapping("/foos")
    @ResponseBody
    public String getFoos(@RequestParam String id) {
        return "ID: " + id;
    }
}
