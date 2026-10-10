public class QueueOperations {
    private int[] queue;
    private int front, rear, capacity, size;

    public QueueOperations(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int value) {
        if (size >= capacity) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        System.out.println("Enqueued: " + value);
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return;
        }
        System.out.println("Dequeued: " + queue[front]);
        front = (front + 1) % capacity;
        size--;
    }

    public void peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Front element: " + queue[front]);
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}