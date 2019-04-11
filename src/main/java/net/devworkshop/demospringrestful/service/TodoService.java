package net.devworkshop.demospringrestful.service;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import net.devworkshop.demospringrestful.entity.Todo;

@Component
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();

	static {
		// Intializing the data
		Todo todoItem1 = new Todo(1,"Lunch with friends",true,new GregorianCalendar(2019,3,25,12,30,00));
		Todo todoItem2 = new Todo(2,"Team meetup",false,new GregorianCalendar(2019,3,25,14,00,00));
		Todo todoItem3 = new Todo(3,"Timesheet",false,new GregorianCalendar(2019,3,25,16,20,00));
		
		todos.add(todoItem1);
		todos.add(todoItem2);
		todos.add(todoItem3);
	}
	
	public List<Todo> getAllTodos(){
		return todos;
	}
	
	public List<Todo> getCompleted(){
		return todos.stream()                				// convert list to stream
                .filter(line -> line.isCompleted() == true) // get the completed one
                .collect(Collectors.toList());              // collect the output and convert streams to a List
	}

}
