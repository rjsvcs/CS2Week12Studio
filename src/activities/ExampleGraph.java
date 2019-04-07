package activities;

import graphs.Graph;

public class ExampleGraph {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        graph.addValue("A");
        graph.addValue("B");
        graph.addValue("C");
        graph.addValue("D");
        graph.addValue("E");
        graph.addValue("F");
        graph.addValue("G");
        graph.addValue("H");
        graph.addValue("I");
        graph.addValue("J");
        graph.addValue("K");

        graph.connectUndirected("A", "B");
        graph.connectUndirected("A", "C");
        graph.connectUndirected("B", "D");
        graph.connectUndirected("B", "E");
        graph.connectUndirected("C", "E");
        graph.connectUndirected("C", "D");
        graph.connectUndirected("C", "H");
        graph.connectUndirected("D", "F");
        graph.connectUndirected("E", "F");
        graph.connectUndirected("F", "G");

        graph.connectUndirected("I", "J");
        graph.connectUndirected("I", "K");
        graph.connectUndirected("J", "K");

        System.out.println("There is a path from A to G: " +
                graph.breadthFirstSearch("A", "G"));
        System.out.println("There is a path from A to J: " +
                graph.breadthFirstSearch("A", "J"));
        System.out.println("There is a path from J to K: " +
                graph.breadthFirstSearch("J", "K"));

        System.out.println("The path from A to G: " +
                graph.breadthFirstPath("A", "G"));
        System.out.println("The path from A to J: " +
                graph.breadthFirstPath("A", "J"));
        System.out.println("The path from J to K: " +
                graph.breadthFirstPath("J", "K"));
    }


}
