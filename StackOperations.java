public class StackOperations {
    private int[] stack;
    private int top;
    private int capacity;

    public StackOperations(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int value) {
        if (top >= capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = value;
        System.out.println("Pushed: " + value);
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
            return;
        }
        System.out.println("Popped: " + stack[top--]);
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}