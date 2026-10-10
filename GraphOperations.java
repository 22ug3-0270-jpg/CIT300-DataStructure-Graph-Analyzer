import java.util.*;

public class GraphOperations {
    private Map<Integer, List<Integer>> adjList;

    public GraphOperations() {
        adjList = new HashMap<>();
    }

    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
        System.out.println("Vertex added: " + v);
    }

    public void addEdge(int v1, int v2) {
        adjList.putIfAbsent(v1, new ArrayList<>());
        adjList.putIfAbsent(v2, new ArrayList<>());
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1);
        System.out.println("Edge added: " + v1 + " <-> " + v2);
    }

    public void display() {
        if (adjList.isEmpty()) {
            System.out.println("Graph is empty!");
            return;
        }
        System.out.println("Graph Adjacency List:");
        for (int v : adjList.keySet()) {
            System.out.println(v + " -> " + adjList.get(v));
        }
    }

    public void bfs(int start) {
        if (!adjList.containsKey(start)) {
            System.out.println("Start vertex not found!");
            return;
        }
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);
        System.out.print("BFS: ");
        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");
            for (int neighbor : adjList.get(v)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int start) {
        if (!adjList.containsKey(start)) {
            System.out.println("Start vertex not found!");
            return;
        }
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS: ");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(int v, Set<Integer> visited) {
        visited.add(v);
        System.out.print(v + " ");
        for (int neighbor : adjList.get(v)) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }
}