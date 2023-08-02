package com.example.demo.repository;

import com.example.demo.model.Race;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaceRepository extends ListCrudRepository<Race, Long> {
}
