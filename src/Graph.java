import java.util.HashMap;
import java.util.Map;

/**
 * An class that implements a graph data structure.
 *
 * @param <T> The type parameter indicating the type of values stored by the
 *           vertices in the graph.
 */
public class Graph<T> {
    /**
     * A {@link Map} of values to vertices.
     */
    private final Map<T, Vertex<T>> vertices;

    /**
     * Creates a new, empty graph.
     */
    public Graph() {
        vertices = new HashMap<>();
    }

    /**
     * Adds the specified value to the graph.
     *
     * @param value The value to add to the graph.
     */
    public void addValue(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value, vertex);
    }

    /**
     * Establishes a directed connection between two values in the graph.
     *
     * @param value1 The first value.
     * @param value2 The second value.
     */
    public void connectDirected(T value1, T value2) {
        Vertex<T> vertex1 = vertices.get(value1);
        Vertex<T> vertex2 = vertices.get(value2);

        vertex1.addNeighbor(vertex2);
    }

    /**
     * Establishes an undirected connection between the two values in the
     * graph.
     *
     * @param value1 The first value.
     * @param value2 The second value.
     */
    public void connectUndirected(T value1, T value2) {
        Vertex<T> vertex1 = vertices.get(value1);
        Vertex<T> vertex2 = vertices.get(value2);

        vertex1.addNeighbor(vertex2);
        vertex2.addNeighbor(vertex1);
    }
}
