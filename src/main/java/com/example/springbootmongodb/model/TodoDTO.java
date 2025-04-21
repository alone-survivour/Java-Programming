package com.example.springbootmongodb.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="todos")
public class TodoDTO {
	@Id
	private String id;
	private String title;
	private String description;
	private Boolean completed;
	private Date createdAt;
	private Date updatedAt;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean isCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public TodoDTO(String id, String title, String description, boolean completed, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.completed = completed;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public TodoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
