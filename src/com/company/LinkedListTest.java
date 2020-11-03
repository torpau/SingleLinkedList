package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    @DisplayName("test to add an item to LinkedList")
    void addItemTest() {
        LinkedList testList = new LinkedList();
        testList.add(666);

        assertEquals(666, testList.get(0), "Adding item did not work");

    }

    @Test
    @DisplayName("test to get an item from LinkedList")
    void getItemTest() {
        LinkedList testList = new LinkedList();
        testList.add(6);
        testList.add(66);
        testList.add(666);

        assertEquals(6, testList.get(0), "Getting item did not work");
        assertEquals(66, testList.get(1), "Getting item did not work");
        assertEquals(666, testList.get(2), "Getting item did not work");

    }

    @Test
    @DisplayName("test to add an item to LinkedList at a given index")
    void addItemAtIndexTest() {
        LinkedList testList = new LinkedList();
        testList.add(1);
        testList.add(2);
        testList.add(4);

        assertEquals(1, testList.get(0), "Adding item did not work");
        assertEquals(2, testList.get(1), "Adding item did not work");
        assertEquals(4, testList.get(2), "Adding item did not work");

        // ------------------------------------------------------------------------
        // inserts value 3 on index 2 and moves previous index 2 forward to index 3
        // ------------------------------------------------------------------------
        testList.add(2, 3);

        assertEquals(1, testList.get(0), "Adding item did not work");
        assertEquals(2, testList.get(1), "Adding item did not work");
        assertEquals(3, testList.get(2), "Adding item did not work");
        assertEquals(4, testList.get(3), "Adding item did not work");
    }

    @Test
    @DisplayName("test to get size from list")
    void getSizeFromListTest() {
        LinkedList testList = new LinkedList();
        assertEquals(0, testList.getSize(), "Size does not match");

        testList.add(1);
        assertEquals(1, testList.getSize(), "Size does not match");

        testList.add(2);
        assertEquals(2, testList.getSize(), "Size does not match");

        testList.add(4);
        assertEquals(3, testList.getSize(), "Size does not match");
    }

    @Test
    @DisplayName("test boolean if list contains given value.")
    void isValueInListTest() {
        LinkedList testList = new LinkedList();
        testList.add(1);
        testList.add(2);
        testList.add(3);

        assertTrue(testList.contains(2), "Searched value was there but still returned false");
    }

    @Test
    @DisplayName("test boolean if list not contains given value.")
    void isValueNotInListTest() {
        LinkedList testList = new LinkedList();
        testList.add(1);
        testList.add(2);
        testList.add(3);

        assertFalse(testList.contains(33), "Searched value was not there but still returned true");
    }

    //remove(i) -> ta bort elementet på position/index i
    @Test
    @DisplayName("Test if value is removed")
    void deleteValueAtGivenIndex(){

    }
    //empty() -> true om listan är tom, annars false
}
