package com.in28minuates.in28minspringboot3springframework6.ex02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity in creating Java Beans
//Public accessor, methods, constructors, equals, hashcode and toString are automatically created.
//Released in JDK16.
record Person (String name, int age, Address address){}
record Address (String firstLine, String city){}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Printing name";
    }

    @Bean
    public int age(){
        return 20;
    }

    @Bean
    @Primary
    public Person person(){
        return new Person("Paul",30,new Address("Baker Street","London"));
    }

    @Bean
    public Person personMethodCall(){
        //Using Bean by Method
        return new Person(name(),age(),address2());
    }

    @Bean
    public Person personParameter(String name, int age, Address customAddress){
        //Using Bean by Parameter (Not address2, it is customAddress which I named)
        return new Person(name,age,customAddress);
    }

    @Bean
    public Person personQualifier(String name, int age, @Qualifier("AdressQualifier") Address customAddress){
        return new Person(name,age,customAddress);
    }

    @Bean
    @Primary
    public Address address(){
        return new Address("Baker Street","London");
    }

    @Bean(name = "customAddress")
    @Qualifier("AdressQualifier")
    public Address address2(){
        return new Address("Baker Street2","London2");
    }
}
