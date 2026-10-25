package com.in28minutes.rest.web.restfulwebservices.user;

import com.in28minutes.rest.web.restfulwebservices.user.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UserJpaResource {

    private UserRepository repository;

    public UserJpaResource(UserRepository repository){
        this.repository = repository;
    }

    @GetMapping(path = "/jpa/users")
    public List<User> retrieveAllUser(){
        return repository.findAll();
    }

    @GetMapping(path = "/jpa/users/{id}")
    public Optional<User> retrieveUser(@PathVariable int id){

        Optional<User> user = repository.findById(id);

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


    @DeleteMapping(path = "/jpa/users/{id}")
    public void deleteUser(@PathVariable int id){
        repository.deleteById(id);
    }

    @PostMapping(value = "/jpa/users")
    public ResponseEntity<User> creatUser(@Valid @RequestBody User user){
        User savedUser = repository.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(path = "/jpa/users/{id}/post")
    public List<Post> retrieveUserPost(@PathVariable int id){

        Optional<User> user = repository.findById(id);

        if (user == null){
//            throw new UserNotFoundException("id : " + id);
        }

        return user.get().getPosts();
    }

}
