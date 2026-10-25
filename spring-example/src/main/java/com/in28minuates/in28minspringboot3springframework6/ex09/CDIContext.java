package com.in28minuates.in28minspringboot3springframework6.ex09;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named
class BusinessClass{
    private DataService dataService;

//    @Autowired
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        System.out.println("Getter Print");
        return dataService;
    }
}

//@Component
@Named
class DataService{

}

@Configuration
@ComponentScan
public class CDIContext {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(CDIContext.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class).getDataService());
        }
    }
}
