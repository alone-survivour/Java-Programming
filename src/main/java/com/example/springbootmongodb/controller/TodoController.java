package com.example.springbootmongodb.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmongodb.model.TodoDTO;
import com.example.springbootmongodb.repositories.TodoRepository;

@RestController
public class TodoController {
	
	@Autowired
	private TodoRepository todoRepo;
	
	@GetMapping("/todos")
	public ResponseEntity<?> getAllTodos() {
		List<TodoDTO> allTodosList = todoRepo.findAll();
		if(allTodosList.size() > 0) {
			return new ResponseEntity<List<TodoDTO>>(allTodosList, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("No Todos available", HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/addtodo")
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO todoObj){
		try {
			todoObj.setCreatedAt(new Date(System.currentTimeMillis()));
			todoRepo.save(todoObj);
			return new ResponseEntity<TodoDTO>(todoObj, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/todos/{id}")
	public ResponseEntity<?> getOneTodo(@PathVariable("id") String todoId){
		Optional<TodoDTO> findTodoItem = todoRepo.findById(todoId);
		if(findTodoItem.isPresent()) {
			return new ResponseEntity<TodoDTO>(findTodoItem.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>("No Todos available with given id: "+todoId, HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/todos/{id}")
	public ResponseEntity<?> updateById(@PathVariable("id") String todoId, @RequestBody TodoDTO updatedTodo){
		Optional<TodoDTO> findTodoItem = todoRepo.findById(todoId);
		if(findTodoItem.isPresent()) {
			TodoDTO currentItem = findTodoItem.get();
			currentItem.setCompleted(updatedTodo.isCompleted() != null ? updatedTodo.isCompleted() : currentItem.isCompleted());
			currentItem.setTitle(updatedTodo.getTitle() != null ? updatedTodo.getTitle() : currentItem.getTitle() );
			currentItem.setDescription( updatedTodo.getDescription() != null ?  updatedTodo.getDescription() : currentItem.getDescription());
			currentItem.setUpdatedAt(new Date(System.currentTimeMillis()));
			todoRepo.save(currentItem);
			return new ResponseEntity<TodoDTO>(currentItem, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("No Todos available with given id: "+todoId, HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/todos/{id}")
	public ResponseEntity<?> deleteTodo(@PathVariable("id") String todoId) {
		Optional<TodoDTO> findTodoItem = todoRepo.findById(todoId);
		if(findTodoItem.isPresent()) {
			TodoDTO currentItem = findTodoItem.get();
			todoRepo.delete(currentItem);
			return new ResponseEntity<>("Todo with id "+todoId+" has been deleted successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("No Todos available with given id: "+todoId, HttpStatus.NOT_FOUND);
		}
	}
}
