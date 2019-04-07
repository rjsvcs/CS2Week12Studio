import java.util.HashSet;
import java.util.Set;

public class Vertex<T> {
    private T value;
    private Set<Vertex<T>> neighbors;

    public Vertex(T value) {
        this.value = value;
        neighbors = new HashSet<>();
    }

    public void addNeighbor(Vertex<T> neighbor) {
        neighbors.add(neighbor);
    }

    public Set<Vertex<T>> getNeighbors() {
        return neighbors;
    }
}
