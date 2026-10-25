package com.in28minuates.in28minspringboot3springframework6.ex08;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency = someDependency;
        System.out.println("All Dependency is ready!");
    }

    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("CleanUp");
    }
}

@Component
class SomeDependency{
    public void getReady(){
        System.out.println("SomeLogic using SomeDependency");
    }
}

@Configuration
@ComponentScan
public class Prepost {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(Prepost.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
