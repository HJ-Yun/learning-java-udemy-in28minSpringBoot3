package com.in28minutes.springboot.learnjpaandhibernate.jdbc;

import com.in28minutes.springboot.learnjpaandhibernate.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.entity.Course;
import com.in28minutes.springboot.learnjpaandhibernate.springdatajpa.CourseSpringJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository1;

    @Autowired
    private CourseJpaRepository repository2;

    @Autowired
    private CourseSpringJpaRepository repository3;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
//        // TODO Auto-Generated method stub
//        System.out.println("Insert SQL - S");
//        repository1.insert(new Course(1,"1","1"));
//        repository1.insert(new Course(2,"2","2"));
//        repository1.insert(new Course(3,"3","3"));
//        System.out.println("Insert SQL - E");
//
//        System.out.println("Delete SQL - S");
//        repository1.deleteById(1);
//        System.out.println("Delete SQL - E");
//
//        System.out.println("Select SQL - S");
//        System.out.println(repository1.findById(2));
//        System.out.println("Select SQL - E");

//        // TODO Auto-Generated method stub
//        System.out.println("Insert SQL - S");
//        repository2.insert(new Course(1,"1","1"));
//        repository2.insert(new Course(2,"2","2"));
//        repository2.insert(new Course(3,"3","3"));
//        System.out.println("Insert SQL - E");
//
//        System.out.println("Delete SQL - S");
//        repository2.deleteById(1);
//        System.out.println("Delete SQL - E");
//
//        System.out.println("Select SQL - S");
//        System.out.println(repository2.findById(2));
//        System.out.println("Select SQL - E");

        // TODO Auto-Generated method stub
        System.out.println("Insert SQL - S");
        repository3.save(new Course(1,"1","1"));
        repository3.save(new Course(2,"2","2"));
        repository3.save(new Course(3,"3","3"));
        System.out.println("Insert SQL - E");

//        System.out.println("Delete SQL - S");
//        repository3.deleteById(1L);
//        System.out.println("Delete SQL - E");
//
//        System.out.println("Select SQL - S");
//        System.out.println(repository3.findById(2L));
//        System.out.println("Select SQL - E");

        System.out.println(repository3.findAll());
        System.out.println(repository3.count());
        System.out.println(repository3.findByAuthor("3"));
    }
}
