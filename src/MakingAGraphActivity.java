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

        graph.connect("A", "B");
        graph.connect("A", "D");
        graph.connect("B", "C");
        graph.connect("C", "D");
        graph.connect("E", "G");
        graph.connect("E", "F");
        graph.connect("F", "G");
    }
}
