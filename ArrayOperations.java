public class ArrayOperations {
    private int[] arr;
    private int size;
    private int capacity;

    public ArrayOperations(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    public void insert(int value) {
        if (size >= capacity) {
            System.out.println("Array is full!");
            return;
        }
        arr[size++] = value;
        System.out.println("Inserted: " + value);
    }

    public void delete(int value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Value not found!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Deleted: " + value);
    }

    public void search(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                System.out.println("Found at index: " + i);
                return;
            }
        }
        System.out.println("Not found!");
    }

    public void display() {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}