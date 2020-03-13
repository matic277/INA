
public class Main {

    public static void main(String[] args) {
        Graph g = new Graph(10000);
        double edges = g.getNumberOfEdges();
        System.out.printf("p: %f\n", Graph.p);
        System.out.println("Edges: " + edges);
    }
}