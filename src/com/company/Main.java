package com.company;

public class Main {

    public static void main(String[] args) {

        //creating a new linkedlist
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.size() ;//-> 3
        System.out.println("List size -> " + list.size());

        list.add(0,99);
        list.size(); //-> 4
        System.out.println("List size -> " + list.size());

        list.get(0); //-> 99
        System.out.println("List get(0) -> " + list.get(0));

        list.get(3); // -> 3
        System.out.println("List get(3) -> " + list.get(3));

        list.remove(3);
        list.size();// -> 3
        System.out.println("List size -> " + list.size());

        list.empty();// -> false
        System.out.println("List empty -> " + list.empty());
        System.out.println(" ");
        
        //---------------------------------------------------
        // Här efter kommer stacken
        //---------------------------------------------------

        Stack stack = new Stack();
        System.out.println("adding item 1,2,3 to stack");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Item on top on stack is: " + stack.peek());
        stack.pop();
        System.out.println("Item on top on stack after pop is: " + stack.peek());
   }
}
