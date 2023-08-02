package com.example.demo.controller;

import com.example.demo.model.Circuit;
import com.example.demo.repository.CircuitRepository;
import com.example.demo.service.ApiConsumer;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/circuit")
public class CircuitController {

    private ApiConsumer apiConsumer;
    private CircuitRepository circuitRepository;

    public CircuitController(ApiConsumer apiConsumer, CircuitRepository circuitRepository) {
        this.apiConsumer = apiConsumer;
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

    @GetMapping("/{id}")
    public Circuit findByCircuitId(@PathVariable String id) {
        return circuitRepository.findByCircuitIdEquals(id);
    }

    @GetMapping("/name")
    public Circuit findByName(@RequestParam String name) {
        return circuitRepository.findByNameContains(name);
    }

    @GetMapping("/loc")
    public Circuit findByLocation(@RequestParam String n) {
        return circuitRepository.findByLocationEquals(n);
    }

    @GetMapping("/webclient")
    public List<Circuit> findAllCircuits() {
        return apiConsumer.findAll();
    }

    @GetMapping("/webclient/{id}")
    public Mono<Circuit> findCircuitById(@PathVariable String id) {
        return apiConsumer.findById(id);
    }
}
