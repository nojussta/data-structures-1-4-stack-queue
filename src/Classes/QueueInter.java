package Classes;

import java.util.ArrayList;
import java.util.LinkedList;

public interface QueueInter<E> {
    void enqueue(E item);

    E dequeue();

    E peak();

    boolean isEmpty();
}

