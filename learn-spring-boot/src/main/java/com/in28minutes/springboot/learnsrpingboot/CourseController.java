package com.in28minutes.springboot.learnsrpingboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    //entity
    //id, name, author
    @RequestMapping("/course")
    public List<Course> retrieveAllCour(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "Nick"),
                new Course(2, "Learn Java", "Mike"),
                new Course(3, "Learn JavaScript", "Tom")
        );
    }

}
