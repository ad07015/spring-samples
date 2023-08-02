package com.example.demo.repository;

import com.example.demo.model.Circuit;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CircuitRepository extends ListCrudRepository<Circuit, Long> {

    List<Circuit> findByCountryEquals(String country);

    Circuit findByNameContains(String name);

    Circuit findByLocationEquals(String name);

    Circuit findByCircuitIdEquals(String circuitId);
}
