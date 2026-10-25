package com.in28minuates.in28minspringboot3springframework6.ex04;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{

    public int[] retrieveData(){
        return new int[] {1,2,3,4,5};
    }
}
