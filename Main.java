import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayOperations array = new ArrayOperations(100);
        StackOperations stack = new StackOperations(100);
        QueueOperations queue = new QueueOperations(100);
        LinkedListOperations list = new LinkedListOperations();
        GraphOperations graph = new GraphOperations();

        while (true) {
            System.out.println("\n===== DATA STRUCTURE & GRAPH ANALYZER =====");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: arrayMenu(sc, array); break;
                case 2: stackMenu(sc, stack); break;
                case 3: queueMenu(sc, queue); break;
                case 4: listMenu(sc, list); break;
                case 5: searchMenu(sc); break;
                case 6: graphMenu(sc, graph); break;
                case 7: performanceMenu(sc); break;
                case 8:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void arrayMenu(Scanner sc, ArrayOperations array) {
        while (true) {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Insert  2. Delete  3. Search  4. Display  5. Back");
            System.out.print("Choice: ");
            int c = sc.nextInt();
            if (c == 5) return;
            switch (c) {
                case 1: System.out.print("Value: "); array.insert(sc.nextInt()); break;
                case 2: System.out.print("Value: "); array.delete(sc.nextInt()); break;
                case 3: System.out.print("Value: "); array.search(sc.nextInt()); break;
                case 4: array.display(); break;
                default: System.out.println("Invalid!");
            }
        }
    }

    static void stackMenu(Scanner sc, StackOperations stack) {
        while (true) {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push  2. Pop  3. Peek  4. Display  5. Back");
            System.out.print("Choice: ");
            int c = sc.nextInt();
            if (c == 5) return;
            switch (c) {
                case 1: System.out.print("Value: "); stack.push(sc.nextInt()); break;
                case 2: stack.pop(); break;
                case 3: stack.peek(); break;
                case 4: stack.display(); break;
                default: System.out.println("Invalid!");
            }
        }
    }

    static void queueMenu(Scanner sc, QueueOperations queue) {
        while (true) {
            System.out.println("\n--- QUEUE OPERATIONS ---");
            System.out.println("1. Enqueue  2. Dequeue  3. Peek  4. Display  5. Back");
            System.out.print("Choice: ");
            int c = sc.nextInt();
            if (c == 5) return;
            switch (c) {
                case 1: System.out.print("Value: "); queue.enqueue(sc.nextInt()); break;
                case 2: queue.dequeue(); break;
                case 3: queue.peek(); break;
                case 4: queue.display(); break;
                default: System.out.println("Invalid!");
            }
        }
    }

    static void listMenu(Scanner sc, LinkedListOperations list) {
        while (true) {
            System.out.println("\n--- LINKED LIST OPERATIONS ---");
            System.out.println("1. Insert  2. Delete  3. Search  4. Display  5. Back");
            System.out.print("Choice: ");
            int c = sc.nextInt();
            if (c == 5) return;
            switch (c) {
                case 1: System.out.print("Value: "); list.insert(sc.nextInt()); break;
                case 2: System.out.print("Value: "); list.delete(sc.nextInt()); break;
                case 3: System.out.print("Value: "); list.search(sc.nextInt()); break;
                case 4: list.display(); break;
                default: System.out.println("Invalid!");
            }
        }
    }

    static void searchMenu(Scanner sc) {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        SearchingOperations.linearSearch(arr, target);
        int[] sorted = arr.clone();
        java.util.Arrays.sort(sorted);
        SearchingOperations.binarySearch(sorted, target);
    }

    static void graphMenu(Scanner sc, GraphOperations graph) {
        while (true) {
            System.out.println("\n--- GRAPH OPERATIONS ---");
            System.out.println("1. Add Vertex  2. Add Edge  3. Display  4. BFS  5. DFS  6. Back");
            System.out.print("Choice: ");
            int c = sc.nextInt();
            if (c == 6) return;
            switch (c) {
                case 1: System.out.print("Vertex: "); graph.addVertex(sc.nextInt()); break;
                case 2:
                    System.out.print("V1: "); int v1 = sc.nextInt();
                    System.out.print("V2: "); int v2 = sc.nextInt();
                    graph.addEdge(v1, v2);
                    break;
                case 3: graph.display(); break;
                case 4: System.out.print("Start: "); graph.bfs(sc.nextInt()); break;
                case 5: System.out.print("Start: "); graph.dfs(sc.nextInt()); break;
                default: System.out.println("Invalid!");
            }
        }
    }

    static void performanceMenu(Scanner sc) {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        PerformanceComparison.compare(arr, target);
    }
}