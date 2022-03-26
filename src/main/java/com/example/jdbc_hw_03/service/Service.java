package com.example.jdbc_hw_03.service;

import com.example.jdbc_hw_03.repository.Repository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

    private final Repository repository;

    public List<String> getProductName(String name) {
        return repository.getProductName(name);
    }
}
