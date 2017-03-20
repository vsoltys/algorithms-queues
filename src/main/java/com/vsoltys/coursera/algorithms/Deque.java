package com.vsoltys.coursera.algorithms;

import java.util.Iterator;

/**
 * Deque. A double-ended queue or deque (pronounced "deck") is a generalization of a stack and a queue
 * that supports adding and removing items from either the front or the back of the data structure.
 *
 * @param <Item>
 */
public class Deque<Item> implements Iterable<Item> {

    public static final int INITIAL_CAPACITY = 10;
    private Item[] items;
    private int head, tail;

    /**
     * construct an empty deque
     */
    public Deque() {
        items = (Item[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * unit testing (optional)
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * is the deque empty?
     *
     * @return
     */
    public boolean isEmpty() {
        return size() > 0;
    }

    /**
     * return the number of items on the deque
     *
     * @return
     */
    public int size() {
        return tail - head;
    }

    /**
     * add the item to the front
     *
     * @param item
     */
    public void addFirst(Item item) {

    }

    /**
     * add the item to the end
     *
     * @param item
     */
    public void addLast(Item item) {

    }

    /**
     * remove and return the item from the front
     *
     * @return
     */
    public Item removeFirst() {
        return null;
    }

    /**
     * remove and return the item from the end
     *
     * @return
     */
    public Item removeLast() {
        return null;
    }

    /**
     * return an iterator over items in order from front to end
     *
     * @return
     */
    public Iterator<Item> iterator() {
        return new DequeIterator<>();
    }

    private class DequeIterator<Item> implements Iterator<Item> {
        private Item first;
        private Item current;

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Item next() {
            return null;
        }
    }
}