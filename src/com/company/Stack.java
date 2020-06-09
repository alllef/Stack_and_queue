package com.company;

import java.util.LinkedList;

public class Stack <T> {
    MyLinkedList<T> myList = new MyLinkedList<>();

    void push(T something) {
        myList.add(something);
    }

    T top() {
        return myList.getLast();
    }

    void pop() {
        myList.deleteLast();
    }

    int size(){
        return  myList.getSize();
    }

    boolean isEmpty(){
        return myList.isEmpty();
    }

}
