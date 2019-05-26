package com.sda.algorytmy;

public class Box<T> { // by to byl typ generyczny mysze dodac w diamentowych naziwasch T od type

    private T element; // tutaj musze zmienic na T

    private T[] tablica;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }
}
