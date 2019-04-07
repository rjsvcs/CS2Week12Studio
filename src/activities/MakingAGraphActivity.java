package activities;

import graphs.Graph;

public class MakingAGraphActivity {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        graph.addValue("A");
        graph.addValue("B");
        graph.addValue("C");
        graph.addValue("D");
        graph.addValue("E");
        graph.addValue("F");
        graph.addValue("G");

        graph.connectUndirected("A", "B");
        graph.connectUndirected("A", "D");
        graph.connectUndirected("B", "C");
        graph.connectUndirected("C", "D");

        graph.connectUndirected("E", "G");
        graph.connectUndirected("E", "F");
        graph.connectUndirected("F", "G");

        System.out.println("There is a path from A to C: " +
                graph.breadthFirstSearch("A", "C"));
        System.out.println("There is a path from A to G: " +
                graph.breadthFirstSearch("A", "G"));

        System.out.println("Path from A to C: " +
                graph.breadthFirstPath("A", "C"));
        System.out.println("Path from A to G: " +
                graph.breadthFirstPath("A", "G"));

    }
}
