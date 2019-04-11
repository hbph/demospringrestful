package net.devworkshop.demospringrestful.entity;

import java.util.Calendar;

/**
 * 
 * @author babu thirumalai Immutable class
 */
public class Todo {
	private String name;
	private boolean completed;
	private Calendar due;
	private int todoId;

	public Todo(int todoId, String name, boolean completed, Calendar due) {
		this.todoId = todoId;
		this.name = name;
		this.completed = completed;
		this.due = due;
	}

	public int getTodoId() {
		return todoId;
	}

	public String getName() {
		return name;
	}

	public boolean isCompleted() {
		return completed;
	}

	public Calendar getDue() {
		return due;
	}

}
