package com.company;

public class Stack extends LinkedList {
    LinkedList list = new LinkedList();
    void push(int value){
        list.add(value);
    }
    void pop(){
        list.remove(list.size()-1);
    }
    int peek(){
        return list.get(list.size()-1);
    }
}
