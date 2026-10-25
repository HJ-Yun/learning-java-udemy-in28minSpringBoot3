package com.in28minuates.in28minspringboot3springframework6.ex02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        // 1. Launch a Spring Context
        // 2. Configure the things that we want Spring to manage. - @Configuration

        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address"));
            System.out.println("--------------------------------------");

            // Not worked, cause Bean name is "customAddress"
//        System.out.println(context.getBean("address2"));
            System.out.println(context.getBean("customAddress"));
            System.out.println("--------------------------------------");

            System.out.println(context.getBean("personMethodCall"));
            System.out.println(context.getBean("personParameter"));
            System.out.println("--------------------------------------");

            System.out.println(context.getBean("personParameter"));
            System.out.println(context.getBean("personQualifier"));
            System.out.println("--------------------------------------");

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("--------------------------------------");
        }

    }
}
