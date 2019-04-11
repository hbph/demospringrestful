package net.devworkshop.demospringrestful.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.devworkshop.demospringrestful.entity.Todo;
import net.devworkshop.demospringrestful.service.TodoService;

@RestController
public class ToController {
	
	@Autowired
	private TodoService todoService;

	@GetMapping("/todos/all")
	public List<Todo> getAllTodos() {
		return todoService.getAllTodos();
	}
	
	@GetMapping("/todos/finished")
	public List<Todo> getCompleted() {
		return todoService.getCompleted();
	}
	
	@ExceptionHandler
    void handleIllegalArgumentException(
                      IllegalArgumentException e,
                      HttpServletResponse response) throws IOException {
		System.out.println("===================");
        response.sendError(HttpStatus.BAD_REQUEST.value());
 
    }
}
