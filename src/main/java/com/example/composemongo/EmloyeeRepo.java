package com.example.composemongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmloyeeRepo extends MongoRepository<Employee, String> {
}
