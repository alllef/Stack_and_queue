package com.company;

public class Main {

    public static void main(String[] args) {
	  Queue<String> queue = new Queue<>();
	  queue.push("Hello");
	  queue.push("beach");
	  queue.push("I love you");
	  System.out.println(queue.top());
	  queue.pop();
	  System.out.println(queue.top());
	  System.out.println(queue.size());
    }
}
