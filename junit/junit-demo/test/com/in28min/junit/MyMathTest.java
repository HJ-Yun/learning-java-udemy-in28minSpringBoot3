package com.in28min.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyMathTest {

    @Test
    public void test(){
        int[] numbers = {1,2,3};

        MyMath myMath = new MyMath();
        int result = myMath.calcSum(numbers);
        System.out.println(result);

        int expectResult = 5;

        assertEquals(result,expectResult);

    }

}
