class RoundRobinScheduler {
    static class Process {
        int processId, burstTime, remainingTime;
        Process next;

        Process(int processId, int burstTime) {
            this.processId = processId;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
        }
    }

    Process last = null;

    void addProcess(int id, int burst) {
        Process newProcess = new Process(id, burst);
        if (last == null) {
            last = newProcess;
            last.next = last;
        } else {
            newProcess.next = last.next;
            last.next = newProcess;
            last = newProcess;
        }
        System.out.println("Added process: P" + id);
    }

    void displayProcesses() {
        if (last == null) {
            System.out.println("No processes in the queue.");
            return;
        }
        Process temp = last.next;
        System.out.println("\nCurrent Process Queue:");
        do {
            System.out.println("P" + temp.processId + " | Burst Time: " + temp.burstTime + " | Remaining: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != last.next);
    }

    void simulate(int timeQuantum) {
        if (last == null) {
            System.out.println("No processes to schedule.");
            return;
        }
        int totalTime = 0, completed = 0, totalWaiting = 0, totalTurnaround = 0;
        int count = 0;

        Process curr = last.next;
        do {
            count++;
            curr = curr.next;
        } while (curr != last.next);

        curr = last.next;
        System.out.println("\nRound Robin Scheduling Simulation:");
        while (completed < count) {
            if (curr.remainingTime > 0) {
                if (curr.remainingTime > timeQuantum) {
                    System.out.println("P" + curr.processId + " executes for " + timeQuantum + " units.");
                    curr.remainingTime -= timeQuantum;
                    totalTime += timeQuantum;
                } else {
                    System.out.println("P" + curr.processId + " executes for " + curr.remainingTime + " units and completes.");
                    totalTime += curr.remainingTime;
                    totalWaiting += (totalTime - curr.burstTime);
                    totalTurnaround += totalTime;
                    curr.remainingTime = 0;
                    completed++;
                }
            }
            curr = curr.next;
        }

        System.out.println("\nAverage Waiting Time: " + (double)totalWaiting / count);
        System.out.println("Average Turnaround Time: " + (double)totalTurnaround / count);
    }

    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        scheduler.addProcess(1, 10);
        scheduler.addProcess(2, 5);
        scheduler.addProcess(3, 8);
        scheduler.displayProcesses();
        scheduler.simulate(4); // Time quantum = 4
    }
}
