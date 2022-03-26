package com.example.jdbc_hw_03.service;

import com.example.jdbc_hw_03.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Service {

    private final Repository repository;

    public List<String> getProductName(String name) {
        return repository.getProductName(name);
    }
}
