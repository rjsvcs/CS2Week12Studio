import java.util.HashMap;
import java.util.Map;

public class Graph<T> {
    private final Map<T, Vertex<T>> vertices;

    public Graph() {
        vertices = new HashMap<>();
    }

    public void addValue(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value, vertex);
    }

    public void connect(T first, T second) {
        Vertex<T> vertex1 = vertices.get(first);
        Vertex<T> vertex2 = vertices.get(second);

        vertex1.addNeighbor(vertex2);
        vertex2.addNeighbor(vertex1);
    }
}
