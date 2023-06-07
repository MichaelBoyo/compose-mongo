package com.example.composemongo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class COntrollerrr {
    private final EmloyeeRepo emloyeeRepo;

    @GetMapping
    public List<Employee> employees() {
        emloyeeRepo.saveAll(List.of(
                new Employee("kiki"),
                new Employee("lola"),
                new Employee("dani"),
                new Employee("moki"),
                new Employee("kiki")
        ));
        return emloyeeRepo.findAll();
    }
}
