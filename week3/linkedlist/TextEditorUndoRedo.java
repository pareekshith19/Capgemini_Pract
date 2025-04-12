class UndoRedoSystem {
    static class Action {
        String action;
        Action prev, next;

        Action(String action) {
            this.action = action;
        }
    }

    Action current = null;

    void performAction(String act) {
        Action newAction = new Action(act);
        if (current != null) {
            current.next = newAction;
            newAction.prev = current;
        }
        current = newAction;
        System.out.println("Performed: " + act);
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.next.action);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.action);
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    void displayHistory() {
        Action temp = current;
        while (temp != null && temp.prev != null) temp = temp.prev;
        System.out.println("\nAction History:");
        while (temp != null) {
            System.out.println("- " + temp.action);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        UndoRedoSystem system = new UndoRedoSystem();
        system.performAction("Typed Hello");
        system.performAction("Bolded Text");
        system.performAction("Inserted Image");
        system.undo();
        system.undo();
        system.redo();
        system.performAction("Changed Font");
        system.displayHistory();
    }
}
