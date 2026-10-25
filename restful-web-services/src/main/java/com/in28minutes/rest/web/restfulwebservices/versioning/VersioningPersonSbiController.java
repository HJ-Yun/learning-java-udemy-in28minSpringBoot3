package com.in28minutes.rest.web.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonSbiController {

    @GetMapping(value = "/{version}/personsbi", version = "1.0.0")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Bob paul");
    }

    @GetMapping(value = "/{version}/personsbi", version = "2.0.0")
    public Name getSecondVersionOfPerson(){
        return new Name("Bob","Paul");
    }

    @GetMapping(path = "/personsbi",version = "1.0.0")
    public PersonV1 getFirstVersionOfPersonRequestParameter(){
        return new PersonV1("Bob paul");
    }

    @GetMapping(path = "/personsbi",version = "2.0.0")
    public Name getSecondVersionOfPersonRequestParameter(){
        return new Name("Bob","Paul");
    }

}
