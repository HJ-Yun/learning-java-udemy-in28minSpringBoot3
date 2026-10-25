package com.in28minutes.rest.web.restfulwebservices.user;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService userDaoService;

    public UserResource (UserDaoService userDaoService){
        this.userDaoService = userDaoService;
    }

    @GetMapping(path = "/users")
    public List<User> retrieveAllUser(){
        return userDaoService.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User retrieveUser(@PathVariable int id){

        User user = userDaoService.findOne(id);

        if (user == null){
//            throw new UserNotFoundException("id : " + id);
        }

        return user;
    }

//    @GetMapping(path = "/users/{id}")
//    public EntityModel<User> retrieveUser(@PathVariable int id){
//
//            User user = userDaoService.findOne(id);
//
//        if (user == null){
////            throw new UserNotFoundException("id : " + id);
//        }
//        EntityModel<User> entityModel = EntityModel.of(user);
//
//        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUser());
//        entityModel.add(link.withRel("all-users"));
//
//        return entityModel;
//    }


    @DeleteMapping(path = "/users/{id}")
    public void deleteUser(@PathVariable int id){
        userDaoService.deleteById(id);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> creatUser(@Valid @RequestBody User user){
        User savedUser = userDaoService.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

}
