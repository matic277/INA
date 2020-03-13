import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    public LinkedList<Node> nodes;
    public static double p;

    public Graph(double nodes) {
        this.nodes = new LinkedList<Node>();
        double possibleEdges = nodes * nodes;
        double wantedEdges = (nodes * Math.log((double)nodes)) / 8;
        p = wantedEdges / possibleEdges;
//        System.out.println("\nPossible edges: " + possibleEdges);
//        System.out.println("Wanted edges: " + wantedEdges);
//        System.out.println("P: " + p + "\n");
        build(nodes);
    }

    public void build(double nodes) {
        for (double i = 0; i < nodes; i++) {
            this.nodes.add(new Node());
        }
        for (Node n : this.nodes) n.randomlyConnect(this.nodes);
    }

    public void construct() {

    }

    public double getNumberOfEdges() {
        double num = 0;
        for (Node n : nodes) {
            num += n.neighNum;
        }
        return num / 2;
    }


}
