import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Node {

    public ArrayList<Node> neighbors;
//    public double neighNum = 0;
//    static Random r = new Random();
    public static int neighNum = 0;

    public Node() {
        neighbors = new ArrayList<Node>(32);
    }

//    public void addNeighbor(Node n) {
//        neighbors.add(n);
//        neighNum++;
//    }

    public static void connectNodes(Node n1, Node n2) {
        n1.neighbors.add(n2);
        n2.neighbors.add(n1);
        neighNum++;
    }

//    public void randomlyConnect(LinkedList<Node> graph) {
//        for (Node n : graph) {
//            if (r.nextDouble() <= Graph.p) {
//                if (n == this) continue;
//                neighbors.add(n);
//                neighNum++;
//                n.neighbors.add(this);
//                n.neighNum++;
//            }
//        }
//    }
}
