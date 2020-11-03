package com.company;

public class Main {

    public static void main(String[] args) {

        //creating a new linkedlist
        LinkedList list = new LinkedList();

        //add(e) -> Lägger till element e till slutet av listan
        list.add(1);
        list.add(3);
        list.add(4);

        //add(i, e) -> Lägger till element e till position/index i, element till "höger" om i flyttar ett steg till höger
        list.add(1, 2);

        //get(i) -> returnerar elementet på position/index i
        // ---------------------------------------
        for(int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
        // ---------------------------------------

        //contains(e) -> true om e finns i listan annars false
        System.out.println("Searching for number 3 in our list!\nValue found: " + list.contains(3));

        //size() -> antalet element i listan
        System.out.println("Size of list: " + list.getSize());



        //remove(i) -> ta bort elementet på position/index i


        //empty() -> true om listan är tom, annars false




        //System.out.println("Size: " + list.getSize());
    }
}
