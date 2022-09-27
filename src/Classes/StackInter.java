package Classes;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public interface StackInter<E> {
    public void push(E item);

    public E pop();


    boolean isEmpty();

    public E peek();
}

class ArrayStack<E> implements StackInter<E> {
    private ArrayList<E> thisList = new ArrayList<>();

    public ArrayStack() {
        this.thisList = new ArrayList<>();
    }

    public ArrayList<E> getCarList() {
        return this.thisList;
    }

    @Override
    public void push(E item) {
        thisList.add(item);
    }

    @Override
    public E pop() {
        if (!isEmpty()) {
            return thisList.remove(thisList.size() - 1);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return thisList.size() == 0;
    }

    @Override
    public E peek() {
        return thisList.get(thisList.size() - 1);
    }
}

class LinkedListStack<E> implements StackInter<E> {
    private LinkedList<E> thisList = new LinkedList<E>();

    public LinkedListStack() {
        this.thisList = new LinkedList<>();
    }

    public LinkedList<E> getCarList() {
        return this.thisList;
    }

    @Override
    public E pop() {
        E removedElement = thisList.pop();
        return removedElement;
    }

    @Override
    public void push(E item) {
        thisList.push(item);
    }

    @Override
    public E peek() {
        return thisList.peekFirst();
    }

    @Override
    public boolean isEmpty() {
        return thisList.isEmpty();
    }
}

class LinkedListStackImplementation<E> implements StackInter<E> {

    private class Node<E> {

        private E element;
        private Node<E> next;

        Node(E data, Node<E> next) {
            this.element = data;
            this.next = next;
        }

        public Node() {

        }
    }

    Node<E> first;

    @Override
    public void push(E x) {
        Node temp = new Node();

        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        temp.element = x;
        temp.next = first;
        first = temp;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public E peek() {
        if (!isEmpty()) {
            return first.element;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    @Override
    public E pop() {
        if (first == null) {
            System.out.print("\nStack Underflow");
            return null;
        }

        first = first.next;
        return null;
    }
}

