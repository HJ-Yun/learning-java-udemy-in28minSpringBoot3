package com.in28minutes.learnspringaop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {

    public int[] retrieveData(){

//        throw new RuntimeException("Something is wrong");
        return new int[] {1,2,3,4,5};
    }
}
