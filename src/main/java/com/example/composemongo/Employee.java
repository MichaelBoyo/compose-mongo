package com.example.composemongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    private String id;
    @NonNull
    private String name;
    public Employee(){

    }
}
