package com.example.springbootmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootmongodb.model.TodoDTO;

@Repository
public interface TodoRepository extends MongoRepository<TodoDTO, String> {
	
}
