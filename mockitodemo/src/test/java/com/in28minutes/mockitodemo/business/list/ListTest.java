package com.in28minutes.mockitodemo.business.list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    void test1(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(1).thenReturn(2);

        assertEquals(1,listMock.size());
        assertEquals(2,listMock.size());
    }

    @Test
    void test2() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("value1");

        assertEquals("value1", listMock.get(0));
    }
}
