package com.descomplica.FrameBlog.controllers;

import com.descomplica.FrameBlog.clients.TodosServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    private final TodosServiceClient todosServiceClient;
    public TodoController(final TodosServiceClient todosServiceClient) {
        this.todosServiceClient = todosServiceClient;
    }

    @GetMapping("/getFakeApiData")
    public @ResponseBody List<Object> getAll(){

        return List.of(todosServiceClient.getAllTodos());
    }

}
