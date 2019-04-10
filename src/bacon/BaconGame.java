package bacon;

import graphs.Graph;

public class BaconGame {
    private final Graph<String> graph;

    public BaconGame() {
        graph = new Graph<>();
    }

    public void connect(String movie, String ... actors) {
        if(!graph.contains(movie)) {
            graph.addValue(movie);
        }

        for(String actor : actors) {
            if(!graph.contains(actor)) {
                graph.addValue(actor);
            }

            graph.connectUndirected(movie, actor);
        }
    }

    public static void main(String[] args) {
        BaconGame game = new BaconGame();

        game.connect("Star Wars",
                "Mark Hamill",
                "Harrison Ford",
                "Carrie Fisher");
        game.connect("Batman The Killing Joke",
                "Mark Hamill",
                "Kevin Conroy",
                "Tara Strong");
        game.connect("Justice League",
                "Kevin Conroy",
                "Michael Rosenbaum",
                "George Newbern");
        game.connect("Smallville",
                "Michael Rosenbaum",
                "Tom Welling",
                "Annette O'Toole",
                "John Schneider");
        game.connect("Superman III",
                "Annette O'Toole",
                "Christopher Reeve",
                "Richard Pryor");
        game.connect("Chain of Desire",
                "Kevin Conroy",
                "Elias Koteas");
        game.connect("Novocaine",
                "Elias Koteas",
                "Kevin Bacon");

        System.out.println(game.graph.breadthFirstPath("Kevin Bacon", "Carrie Fisher"));

    }
}
