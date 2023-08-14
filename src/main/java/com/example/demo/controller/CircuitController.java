package com.example.demo.controller;

import com.example.demo.model.Circuit;
import com.example.demo.repository.CircuitRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/circuit")
public class CircuitController {

    private CircuitRepository circuitRepository;

    public CircuitController(CircuitRepository circuitRepository) {
        this.circuitRepository = circuitRepository;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
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

    @PostMapping
    public ResponseEntity<Circuit> createCircuit(@RequestBody Circuit newCircuit) {
        Circuit circuit = circuitRepository.save(newCircuit);
        return new ResponseEntity<>(circuit, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{circuitId}")
    public ResponseEntity<Long> deleteById(@PathVariable long circuitId) {
        Optional<Circuit> optCircuit = circuitRepository.findById(circuitId);
        if (optCircuit.isPresent()) {
            circuitRepository.delete(optCircuit.get());
            return new ResponseEntity<>(circuitId, HttpStatus.OK);
        }
        return new ResponseEntity<>(circuitId, HttpStatus.NO_CONTENT);
    }
}
