package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest extends LinkedList {
    @Test
    @DisplayName("Test if item added to stack")
    void testIfAddedToStack(){
        Stack testStack = new Stack();
        testStack.push(1);

        assertEquals(1, testStack.peek());
    }

    @Test
    @DisplayName("Test if added item is on top")
    void testIfAddedToTop(){
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);

        assertEquals(2, testStack.peek());
    }

    @Test
    @DisplayName("Test if item on top is removed")
    void testIfItemOnTopGone(){
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);

        assertEquals(3, testStack.peek());
        testStack.pop();
        assertEquals(2, testStack.peek());

    }
}
