package com.example.demo.controller;

import com.example.demo.model.Race;
import com.example.demo.repository.RaceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class RaceControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RaceRepository raceRepository;

    @Test
    void findAll() throws Exception {
        when(raceRepository.findAll())
                .thenReturn(List.of(new Race()));
        mockMvc.perform(get("/api/race"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}