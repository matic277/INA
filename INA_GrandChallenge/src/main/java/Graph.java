import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class Graph {

    public ArrayList<Node> nodes;
    public static double p;
    public static int wantedEdges;

    public Graph(int nodes) {
        System.out.println("Nodes: "+ nodes);
        this.nodes = new ArrayList<Node>(nodes);
        double possibleEdges = (double)nodes * nodes;
        wantedEdges = (int) ((nodes * Math.log((double)nodes)) / 8);
        p = wantedEdges / possibleEdges;

//        System.out.println("\nPossible edges: " + possibleEdges);
//        System.out.println("Wanted edges: " + wantedEdges);
//        System.out.println("P: " + p + "\n");

        build(nodes);
    }

    public void build(int nodes) {
//        for (int i = 0; i < nodes; i++) {
//            this.nodes.add(new Node());
//        }
//        for (Node n : this.nodes) n.randomlyConnect(this.nodes);

        long t = System.currentTimeMillis();
        int i = 0;
        int j = 0;
        Random r = new Random();
//        HashSet<String> map = new HashSet<>(Integer.MAX_VALUE/4);
        while (wantedEdges-- > 0) {
            i = r.nextInt(nodes);
            j = r.nextInt(nodes);
            if (this.nodes.get(i) == null) {
                this.nodes.add(i, new Node());
            }
            if (this.nodes.get(j) == null) {
                this.nodes.add(j, new Node());
            }
//            if (map.contains(i + "-" + j)) continue;
//            map.add(i + "-" + j);
//            wantedEdges--;
            Node.connectNodes(this.nodes.get(i), this.nodes.get(j));
//            if (wantedEdges % 10 == 0)
                System.out.println(wantedEdges);
        }
        System.out.println("Time to build: " + (System.currentTimeMillis() - t) / 1000);
    }

    public int getNumberOfEdges() {
        return Node.neighNum;
    }


}
