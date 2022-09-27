package Classes;

import java.util.ArrayList;
import java.util.LinkedList;

public interface QueueInter<E> {
    void enqueue(E item);

    E dequeue();

    E peak();

    boolean isEmpty();
}

class ArrayQueue<E> implements QueueInter<E> {

    private ArrayList<E> thisList = new ArrayList<>();

    public ArrayQueue() {
        this.thisList = new ArrayList<E>();
    }

    public ArrayList<E> getCarList() {
        return this.thisList;
    }

    @Override
    public void enqueue(E item) {
        thisList.add(item);
    }

    @Override // =====> O(n)
    public E dequeue() {
        E firstElement = peak();
        if (firstElement != null) {
            thisList.remove(0);
        }
        return firstElement;
    }

    @Override
    public E peak() {
        if (!isEmpty()) {
            return thisList.get(0);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return thisList.size() == 0;
    }
}

class LinkedListQueue<E> implements QueueInter<E> {
    private LinkedList<E> thisList;

    public LinkedListQueue() {
        thisList = new java.util.LinkedList<E>();
    }

    public LinkedList<E> getCarList() {
        return this.thisList;
    }

    @Override
    public void enqueue(E item) {
        thisList.add(item);
    }

    @Override
    public E dequeue() {
        E firstElement = thisList.removeFirst();
        return firstElement;
    }

    @Override
    public E peak() {
        return thisList.peek();
    }

    @Override
    public boolean isEmpty() {
        return thisList.isEmpty();
    }
}