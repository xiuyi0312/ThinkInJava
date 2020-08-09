package com.example.chapter15;

public class LinkedStack<T> {
    private static class Node<T> {
        T item;
        Node<T> next;

        public Node() {
            this.item = null;
            this.next = null;
        }

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>();

    public void push(T item) {
        top = new Node<>(item, top);
    }

    private T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String word :
                "Hello the world".split(" ")) {
            lss.push(word);
        }
        String elem;
        while ((elem = lss.pop()) != null) {
            System.out.println(elem);
        }
    }
}
