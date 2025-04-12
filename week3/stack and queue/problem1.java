import java.util.Stack;

public class problem1 {
    static class MyQueue {
        Stack<Integer> stackEnqueue = new Stack<>();
        Stack<Integer> stackDequeue = new Stack<>();

        public void enqueue(int x) {
            stackEnqueue.push(x);
        }

        public int dequeue() {
            if (stackDequeue.isEmpty()) {
                while (!stackEnqueue.isEmpty()) {
                    stackDequeue.push(stackEnqueue.pop());
                }
            }

            if (stackDequeue.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }

            return stackDequeue.pop();
        }

        public int peek() {
            if (stackDequeue.isEmpty()) {
                while (!stackEnqueue.isEmpty()) {
                    stackDequeue.push(stackEnqueue.pop());
                }
            }

            if (stackDequeue.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }

            return stackDequeue.peek();
        }

        public boolean isEmpty() {
            return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
        }
    }

    
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
        
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
    }
    
}
