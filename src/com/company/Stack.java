package com.company;

public class Stack extends LinkedList {
    LinkedList list = new LinkedList();
    Stack(){

    }
    void push(int value){
        list.add(value);
    }
    void pop(){
    list.remove(list.size()-1);
    }
    int peek(){
        return list.get(list.size()-1);
    }


    /*
    push(i) för att lägga till i på toppen av stacken
    pop() för att plocka ut det översta elementet
    peek() för att få tag i det översta elementet men lämna det på stacken.

 */

}
