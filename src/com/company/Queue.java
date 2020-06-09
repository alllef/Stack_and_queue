package com.company;

import java.util.LinkedList;

public class Queue<T> {
    MyLinkedList<T> myList = new MyLinkedList<>();

    void push(T something) {
        myList.add(something);
    }

    T top() {
        return myList.getFirst();
    }

    void pop() {
        myList.deleteFirst();
    }

    int size(){
        return  myList.getSize();
    }

    boolean isEmpty(){
        return myList.isEmpty();
    }

}
