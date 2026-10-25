package com.in28minutes.springsecurity.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private static final List<Todo> TODO_LIST = List.of(
            new Todo("LearnAWS", "AWS"),
            new Todo("LearnCloud", "Cloud")
    );

    @GetMapping("/todos")
    public List<Todo> todos(){
        return TODO_LIST;
    }

    @GetMapping("/todos/{username}")
    public Todo getOneTodos(@PathVariable("username") String username){
        return TODO_LIST.get(0);
    }

    @PostMapping("/todos/{username}")
    public void createOneTodos(@PathVariable("username") String username, @RequestBody Todo todo){
        logger.info("Create {} for {}", todo, username);
    }
}

record Todo(String username, String description){

}