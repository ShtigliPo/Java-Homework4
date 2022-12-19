package ru.gb;

import java.util.LinkedList;


/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class App 
{
    public static void main( String[] args )
    {
        LinkedList<String> myTest = new LinkedList<String>();
     
        enqueue (myTest, "a123");
        System.out.printf("Add element 0 -> %s\n", myTest);

        enqueue (myTest, "b2345");
        System.out.printf("Add element 1 -> %s\n", myTest);

        enqueue (myTest, "c34567");
        System.out.printf("Add element 2 -> %s\n", myTest);

        enqueue (myTest, "d456789");
        System.out.printf("Add element 3 -> %s\n", myTest);

        enqueue (myTest, "f111");
        System.out.printf("Add element 4 -> %s\n", myTest);

        System.out.printf("First element -> %s\n", dequeue (myTest));
        System.out.printf("Remove first element -> %s\n", myTest);

        System.out.printf("Last element -> %s\n", dequeueLast(myTest));
        System.out.printf("Remove last element -> %s\n", myTest);

        System.out.printf("First element -> %s\n", first (myTest));
        System.out.printf("No remove first element -> %s\n", myTest);

        System.out.printf("Last element -> %s\n", last (myTest));
        System.out.printf("No remove last element -> %s\n", myTest);
    }

    public static void enqueue(LinkedList<String> test, String str) {
        test.addLast(str);
    }

    public static String dequeue(LinkedList<String> test) {
        return test.pollFirst();
    }
    
    public static String dequeueLast(LinkedList<String> test) {
        return test.pollLast();
    }

    public static String first(LinkedList<String> test) {
        return test.peekFirst();
    }

    public static String last(LinkedList<String> test) {
        return test.peekLast();
    }
}
