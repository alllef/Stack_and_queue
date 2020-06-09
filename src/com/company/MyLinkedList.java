package com.company;

public class MyLinkedList<T> {

    public class Node {
        Node nextNode;
        T data;
        Node(T data, Node nextNode){
            this.data=data;
            this.nextNode=nextNode;
        }
    }

    Node node = null;
    private int size = 0;

   int getSize(){
       return size;
   }

    void add(T data) {
        if (node == null) node = new Node(data, null);
        else {
            Node tmpNode = node;
            while (tmpNode.nextNode != null) {
                tmpNode = tmpNode.nextNode;

            }
            tmpNode.nextNode = new Node(data, null);
        }
        size++;
    }

    T getData(int index) {
        Node tmpNode = node;
        for (int i = 0; i < index; i++) {
            tmpNode = tmpNode.nextNode;
        }
        return tmpNode.data;
    }

    T getLast(){
     return    getData(size-1);
    }

    T getFirst(){
        return getData(0);
    }

    void delete(int index) {
        if (size == 1 || index ==0) node = node.nextNode;
        else {

            Node tmpNode = node;
            for (int i = 0; i < index - 1; i++) {
                tmpNode = tmpNode.nextNode;
            }
            tmpNode.nextNode = tmpNode.nextNode.nextNode;
        }
        size--;
    }

    void deleteLast(){
        delete(size-1);
    }

    void deleteFirst(){
        delete(0);
    }

boolean isEmpty(){
    return size == 0;
}

}
