package com.company;

public class LinkedList {
    private Node head = null;
    private int size = 0;

    LinkedList() {  }

    void add(int index, int value) {
        try {
            Node newNode = new Node();
            Node currNode = head;
            Node prevNode = null;
            if (index != 0) {
                for (int i = 0; i <= index - 1; i++) {
                    prevNode = currNode;
                    currNode = currNode.next;
                }
                newNode.next = currNode;
                newNode.value = value;
                prevNode.next = newNode;
            } else {
                newNode.value = value;
                newNode.next = currNode;
                head = newNode;
            }
            size++;
        } catch(NullPointerException e) {
            System.err.println(">>> Index-number out of list range <<<");
        }
    }

    void add(int value) {
        Node newNode = new Node();
        Node currNode = head;

        if(head == null) {
            newNode.value = value;
            head = newNode;
        } else {
            currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            newNode.value = value;
            currNode.next = newNode;
        }
        size++;
    }

    int get(int index) {
        Node currNode = head;

        for(int i = 0; i <= index-1; i++) {
            currNode = currNode.next;
        }
        return currNode.value;
    }

    int getSize() {
        return this.size;
    }

    boolean contains(int value) {
        Node currNode = head;

        int i = 0;
        if(currNode != null) {
            do {
                if (currNode.value == value) {
                    return true;
                }
                currNode = currNode.next;
                i++;
            } while (i < size);
        }
        return false;
    }


}

// -------------------------

class Node {
    Node next;
    int value;

}
