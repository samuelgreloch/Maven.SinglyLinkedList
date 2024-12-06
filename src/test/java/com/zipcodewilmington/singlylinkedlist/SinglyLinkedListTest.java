package com.zipcodewilmington.singlylinkedlist;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    private LinkedList<Integer> list;



void setUp(){
    list = new LinkedList<>();
    }


    @Test

    void testAdd() {

    list.add(5);
    list.add(10);
    list.add(15);

    assertEquals(3, list.size(), "Size is 3 when you add 3 ");
    assertTrue(list.contains(5),"List contains 5");
    assertTrue(list.contains(10),"List contains 10");
    assertTrue(list.contains(15),"List contains 15");

    }
    @Test
    void testRemove(){
        list.add(5);
        list.add(10);
        list.add(15);

        list.remove(1);

        assertEquals(2,list.size());
        assertFalse(list.contains(5), "20 is removed");
        assertTrue(list.contains(10),"List contains 10");
        assertTrue(list.contains(15),"List contains 15");

    }
    @Test
    void testContains(){
        list.add(5);
        list.add(10);
        list.add(15);

        assertTrue(list.contains(5),"List contains 5");
        assertTrue(list.contains(10),"List contains 10");
        assertTrue(list.contains(15),"List contains 15");

        assertFalse(list.contains(40),"List does not contain 20");

    }
    @Test

    void testFind(){
    list.add(5);
    list.add(10);
    list.add(15);

    assertEquals(0, list.find(5), "5 should be positioned at 0");
    assertEquals(1,list.find(10),"10 should be positioned at 1");
    assertEquals(2, list.find(15), "15 should be positioned at 2");
    assertEquals(-1, list.find(60), "50 does not exist in the index return -1");

    }
    @Test
    void testSize(){
        list.add(5);
        list.add(10);
        list.add(15);

        assertEquals(5, list.get(0), "Index 0 is 5");
        assertEquals(10, list.get(1), "Index 1 is 10");
        assertEquals(15, list.get(2), "Index 2 is 15");
    }







}
