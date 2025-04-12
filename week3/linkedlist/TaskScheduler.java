class TaskScheduler {
    static class Task {
        int taskId;
        String taskName;
        int priority;
        String dueDate;
        Task next;

        Task(int taskId, String taskName, int priority, String dueDate) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
        }
    }

    Task head = null;

    // Add task at the end
    void addTaskEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }

    // Add task at the beginning
    void addTaskBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newTask.next = head;
            temp.next = newTask;
            head = newTask;
        }
    }

    // Add at specific position
    void addTaskAtPosition(int pos, int taskId, String taskName, int priority, String dueDate) {
        if (pos == 0) {
            addTaskBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;
        for (int i = 0; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newTask.next = temp.next;
        temp.next = newTask;
    }

    // Remove task by ID
    void removeTask(int taskId) {
        if (head == null) return;

        if (head.taskId == taskId && head.next == head) {
            head = null;
            return;
        }

        Task curr = head, prev = null;
        do {
            if (curr.taskId == taskId) {
                if (curr == head) {
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // View current task and move to next
    Task currentTask = null;

    void viewNextTask() {
        if (head == null) {
            System.out.println("No tasks.");
            return;
        }
        if (currentTask == null) {
            currentTask = head;
        } else {
            currentTask = currentTask.next;
        }
        System.out.println("Current Task: " + currentTask.taskId + " - " + currentTask.taskName);
    }

    // Display all tasks from head
    void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        Task temp = head;
        System.out.println("All Tasks:");
        do {
            System.out.println(temp.taskId + " | " + temp.taskName + " | Priority: " + temp.priority + " | Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    void searchByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        System.out.println("Tasks with priority " + priority + ":");
        do {
            if (temp.priority == priority) {
                System.out.println(temp.taskId + " - " + temp.taskName);
            }
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTaskEnd(1, "Write report", 2, "2025-04-10");
        scheduler.addTaskBeginning(2, "Fix bug", 1, "2025-04-08");
        scheduler.addTaskAtPosition(1, 3, "Team meeting", 3, "2025-04-09");
        scheduler.displayTasks();

        scheduler.viewNextTask();
        scheduler.viewNextTask();
        scheduler.searchByPriority(2);

        scheduler.removeTask(2);
        System.out.println("\nAfter removing task 2:");
        scheduler.displayTasks();
    }
}
