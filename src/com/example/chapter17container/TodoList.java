package com.example.chapter17container;

import java.util.PriorityQueue;

/**
 * based on priority queue
 */
public class TodoList extends PriorityQueue<TodoList.TodoItem> {
    static class TodoItem implements Comparable<TodoItem> {

        private char primary;
        private int secondary;
        private String item;

        public TodoItem(char primary, int secondary, String item) {
            this.primary = primary;
            this.secondary = secondary;
            this.item = item;
        }

        @Override
        public int compareTo(TodoItem o) {
            if (primary > o.primary) {
                return 1;
            }
            if (primary == o.primary) {
                if (secondary > o.secondary) {
                    return 1;
                } else if (secondary == o.secondary) {
                    return 0;
                } else {
                    return -1;
                }
            }
            return -1;
        }

        @Override
        public String toString() {
            return Character.toString(primary) + secondary + ": " + item;
        }
    }

    public void add(char p, int s, String t) {
        super.add(new TodoItem(p, s, t));
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.add('Z', 3, "washing");
        todoList.add('Z', 2, "cooking");
        todoList.add('S', 3, "studying");
        todoList.add('J', 1, "Java");

        while (!todoList.isEmpty()) {
            System.out.println(todoList.remove());
        }
    }
}
