package com.sda.algorytmy;

public class LinkedListImpl<E> implements MyList<E> {

    private int size = 0;
    private Node head;

    public LinkedListImpl() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E e) {

        if (size == 0) {
            head = new Node(e);
        } else {

            Node tmp = head;
            head = new Node(e);
            head.next = tmp;

        }
        size++;
        return true;
    }

    @Override
    public boolean remove(int a) {

        return false;
    }

    @Override
    public int find(int a) {
        return 0;


    }

    //zagniezdzenie class
    class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LinkedListImpl{" +
                "size=" + size +
                ", head=" + head +
                '}';
    }
}
