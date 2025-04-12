class FriendConnections {
    static class Friend {
        String name;
        String userId;
        Friend next;

        Friend(String name, String userId) {
            this.name = name;
            this.userId = userId;
        }
    }

    Friend head = null;

    void addFriend(String name, String userId) {
        Friend newFriend = new Friend(name, userId);
        if (head == null) {
            head = newFriend;
        } else {
            Friend temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newFriend;
        }
    }

    void removeFriend(String userId) {
        if (head == null) return;
        if (head.userId.equals(userId)) {
            head = head.next;
            return;
        }
        Friend temp = head, prev = null;
        while (temp != null && !temp.userId.equals(userId)) {
            prev = temp;
            temp = temp.next;
        }
        if (temp != null) prev.next = temp.next;
    }

    void searchFriend(String name) {
        Friend temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Found friend: " + temp.name + " (" + temp.userId + ")");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Friend not found.");
    }

    void displayFriends() {
        Friend temp = head;
        System.out.println("Friend List:");
        while (temp != null) {
            System.out.println(temp.name + " (" + temp.userId + ")");
            temp = temp.next;
        }
    }

    void countFriends() {
        int count = 0;
        Friend temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Friends: " + count);
    }

    public static void main(String[] args) {
        FriendConnections fc = new FriendConnections();
        fc.addFriend("Alice", "alice123");
        fc.addFriend("Bob", "bob99");
        fc.addFriend("Charlie", "charlie07");
        fc.displayFriends();
        fc.searchFriend("Bob");
        fc.removeFriend("bob99");
        System.out.println("\nAfter Removing Bob:");
        fc.displayFriends();
        fc.countFriends();
    }
}
