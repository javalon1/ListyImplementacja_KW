package com.sda.algorytmy;

import java.util.Arrays;

public class ListImpl<E> implements MyList<E> {

    private int size =0;
    private int DEFAULT_CAPACITY = 10;
    private Object elementData[];


    public ListImpl() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E e) {

        if (size == DEFAULT_CAPACITY){
            Object[] tmp = elementData;
            elementData = new Object[elementData.length * 2];
            for (int i = 0; i <tmp.length ; i++) {
                elementData[i] = tmp[i];
            }

        }

        elementData[size++] = e;
        return true;


    }

    @Override
    public boolean remove(int a) {

        for (int i = a; i < elementData.length - 2 ; i++) {
            elementData[i] = elementData[i+1];
        }
        //elementData[elementData.length-1] = null;
        return true;
    }

    @Override
    public int find(int a) {
        for (int i = 0; i < elementData.length ; i++) {
            if (elementData[i].equals(a)){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }



}
