public class problem5 {

    static class CircularBuffer {
        int[] buffer;
        int front, rear, size;

        CircularBuffer(int size) {
            this.size = size;
            buffer = new int[size];
            front = 0;
            rear = 0;
        }

        void insert(int val) {
            buffer[rear] = val;
            rear = (rear + 1) % size;
            if (rear == front) {
                front = (front + 1) % size; // overwrite the oldest element
            }
        }

        void display() {
            for (int i = front; i != rear; i = (i + 1) % size) {
                System.out.print(buffer[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4); // Overwrites 1
        System.out.print("Buffer: ");
        buffer.display(); // Output: 2 3 4
    }
}
