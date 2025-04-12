class InventoryManagement {
    static class Item {
        String itemName;
        int itemId;
        int quantity;
        double price;
        Item next;

        Item(String itemName, int itemId, int quantity, double price) {
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
        }
    }

    Item head = null;

    // Add item at end
    void addItem(String name, int id, int qty, double price) {
        Item newItem = new Item(name, id, qty, price);
        if (head == null) {
            head = newItem;
        } else {
            Item temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newItem;
        }
    }

    // Remove item by ID
    void removeItem(int id) {
        if (head == null) return;
        if (head.itemId == id) {
            head = head.next;
            return;
        }
        Item curr = head, prev = null;
        while (curr != null && curr.itemId != id) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) prev.next = curr.next;
    }

    // Update quantity by ID
    void updateQuantity(int id, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by ID or Name
    void searchItem(String keyword) {
        Item temp = head;
        while (temp != null) {
            if (String.valueOf(temp.itemId).equals(keyword) || temp.itemName.equalsIgnoreCase(keyword)) {
                System.out.println("Found: " + temp.itemName + " | Qty: " + temp.quantity + " | Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Total inventory value
    void totalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: Rs. " + total);
    }

    // Sort by name
    void sortByName() {
        if (head == null || head.next == null) return;
        head = mergeSort(head, true);
    }

    // Sort by price
    void sortByPriceDescending() {
        if (head == null || head.next == null) return;
        head = mergeSort(head, false);
    }

    // Merge sort for linked list
    Item mergeSort(Item h, boolean byName) {
        if (h == null || h.next == null) return h;
        Item middle = getMiddle(h);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(h, byName);
        Item right = mergeSort(nextOfMiddle, byName);

        return sortedMerge(left, right, byName);
    }

    Item sortedMerge(Item a, Item b, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;
        Item result;
        if ((byName && a.itemName.compareTo(b.itemName) <= 0) || (!byName && a.price > b.price)) {
            result = a;
            result.next = sortedMerge(a.next, b, byName);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, byName);
        }
        return result;
    }

    Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void displayItems() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.itemName + " | ID: " + temp.itemId + " | Qty: " + temp.quantity + " | Rs." + temp.price);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InventoryManagement im = new InventoryManagement();
        im.addItem("Mouse", 101, 50, 250.00);
        im.addItem("Keyboard", 102, 30, 700.00);
        im.addItem("Monitor", 103, 20, 8000.00);
        im.displayItems();
        im.totalValue();
        System.out.println("\nSorted by Name:");
        im.sortByName();
        im.displayItems();
        System.out.println("\nSorted by Price (Desc):");
        im.sortByPriceDescending();
        im.displayItems();
    }
}
