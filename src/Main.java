import Classes.ArrayStack;
import Classes.LinkedListStack;
import Classes.QueueInter;
import Classes.StackInter;

public class Main {
    public static <E> void main(String[] args) {
        System.out.println("===============================Array stack===============================");
        ArrayStack<Integer> arrayStack = new ArrayStack<Integer>();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        arrayStack.push(6);

        while (!arrayStack.isEmpty()) {
            System.out.println(arrayStack.peek());
            System.out.println(arrayStack.pop());
        }

        System.out.println("===============================Linkedlist stack===============================");
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<Integer>();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.push(5);
        linkedListStack.push(6);
        while (!linkedListStack.isEmpty()) {
            System.out.println(linkedListStack.peek());
            System.out.println(linkedListStack.pop());
        }
    }
}