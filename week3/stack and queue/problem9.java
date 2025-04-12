
public class problem9 {
    class CustomHashMap {
        static class Node {
            int key, value;
            Node next;
            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
    
        private final int SIZE = 1000;
        private Node[] map = new Node[SIZE];
    
        private int hash(int key) {
            return key % SIZE;
        }
    
        public void put(int key, int value) {
            int index = hash(key);
            Node head = map[index];
            while (head != null) {
                if (head.key == key) {
                    head.value = value;
                    return;
                }
                head = head.next;
            }
            Node newNode = new Node(key, value);
            newNode.next = map[index];
            map[index] = newNode;
        }
    
        public Integer get(int key) {
            int index = hash(key);
            Node head = map[index];
            while (head != null) {
                if (head.key == key) {
                    return head.value;
                }
                head = head.next;
            }
            return null;
        }
    
        public void remove(int key) {
            int index = hash(key);
            Node head = map[index];
            Node prev = null;
            while (head != null) {
                if (head.key == key) {
                    if (prev != null) {
                        prev.next = head.next;
                    } else {
                        map[index] = head.next;
                    }
                    return;
                }
                prev = head;
                head = head.next;
            }
        }
    
        public static void main(String[] args) {
            CustomHashMap map = new CustomHashMap();
            map.put(1, 10);
            map.put(2, 20);
            System.out.println(map.get(1));
            map.remove(1);
            System.out.println(map.get(1));
        }
    }
    
    
}
