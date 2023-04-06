package com.example.demo.repository;

import com.example.demo.model.Circuit;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitRepository extends ListCrudRepository<Circuit, Long> {
}
