import java.util.Scanner;

class StaticQueueTest {
    public static void main(String[] args) {
        String command;
        StaticQueue<Integer> myQueue = new StaticQueue<>(3);
        System.out.println(myQueue.toString());
        myQueue.enqueue(1);
        System.out.println(myQueue.toString());
        myQueue.enqueue(2);
        System.out.println(myQueue.toString());
        myQueue.enqueue(3);
        System.out.println(myQueue.toString());
        myQueue.dequeue();
        System.out.println(myQueue.toString());
        myQueue.dequeue();
        System.out.println(myQueue.toString());
        myQueue.clear();
        System.out.println(myQueue.toString());
        myQueue.enqueue(4);
        System.out.println("The size of the queue is: " + myQueue.size() + " and the last item is: " + myQueue.peek() + ", is the queue empty? " + myQueue.isEmpty());
    }
}
