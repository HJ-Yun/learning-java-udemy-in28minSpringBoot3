package com.in28minutes.rest.web.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Bob paul");
    }

    @GetMapping("/v2/person")
    public Name getSecondVersionOfPerson(){
        return new Name("Bob","Paul");
    }

    @GetMapping(path = "/person",params = "version=1")
    public PersonV1 getFirstVersionOfPersonRequestParameter(){
        return new PersonV1("Bob paul");
    }

    @GetMapping(path = "/person",params = "version=2")
    public Name getSecondVersionOfPersonRequestParameter(){
        return new Name("Bob","Paul");
    }

    @GetMapping(path = "/person/header",headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader(){
        return new PersonV1("Bob paul");
    }

    @GetMapping(path = "/person/header",headers = "X-API-VERSION=2")
    public Name getSecondVersionOfPersonRequestHeader(){
        return new Name("Bob","Paul");
    }

    @GetMapping(path = "/person/accept",produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionOfPersonAcceptHeader(){
        return new PersonV1("Bob paul");
    }

    @GetMapping(path = "/person/accept",produces = "application/vnd.company.app-v2+json")
    public Name getSecondVersionOfPersonAcceptHeader(){
        return new Name("Bob","Paul");
    }

}
