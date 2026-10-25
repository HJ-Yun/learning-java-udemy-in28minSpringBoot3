package com.in28minuates.in28minspringboot3springframework6.ex06;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{

}

@Component
//@Lazy
class ClassB{

    private ClassA classA;

    public ClassB(ClassA classA){
        System.out.println("Initialization Class A in Class B");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Do Something");
    }
}

@Configuration
@ComponentScan
public class LazyInitialization {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(LazyInitialization.class)) {
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            context.getBean(ClassB.class).doSomething();
        }


    }
}
