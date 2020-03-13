import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Node {

    public LinkedList<Node> neighbors;
    public double neighNum = 0;
    static Random r = new Random();

    public Node() {
        neighbors = new LinkedList<Node>();
    }

    public void randomlyConnect(LinkedList<Node> graph) {
        for (Node n : graph) {
            if (r.nextDouble() <= Graph.p) {
                if (n == this) continue;
                neighbors.add(n);
                neighNum++;
                n.neighbors.add(this);
                n.neighNum++;
            }
        }
    }
}
