/**
 * Container implementation
 * @author a.parinova
 */
package com.parinova.lab1;

public class Container {
    private Object[] container;
    private int size;

    /**
     * Constructs a new Container with an initial capacity of 10.
     */
    public Container() {
        container = new Object[10];
        size = 0;
    }

    /**
     * Adds an element to the end of the container. If the container is full, it
     * automatically increases its capacity by 10 elements.
     *
     * @param element The element to add.
     */
    public void add(Object element) {
        if (size == container.length) {
            Object[] newContainer = new Object[size + 10];
            System.arraycopy(container, 0, newContainer, 0, size);
            container = newContainer;
        }

        container[size] = element;
        size++;
    }

    /**
     * Retrieves an element at the specified index.
     *
     * @param index The index of the element to retrieve.
     * @return The element at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    public Object get(int index) {
        if (index >= 0 && index < size) {
            return container[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    /**
     * Removes the element at the specified index, shifting all subsequent
     * elements to the left.
     *
     * @param index The index of the element to remove.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                container[i] = container[i + 1];
            }
            container[size - 1] = null;
            size--;
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }
}
