import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class Graph2 {

    public boolean n[][];
    int[] neighborsCount;
    public static double p;
    int wantedEdges;

    public Graph2(int nodes) {
        this.neighborsCount = new int[nodes];
        this.n = new boolean[nodes][];
        for (int i=0; i<n.length; i++)
            n[i] = new boolean[nodes - i];

        double possibleEdges = (double)nodes * nodes;
        wantedEdges = (int) ((nodes * Math.log(nodes)) / 8);
        p = wantedEdges / possibleEdges;

//        System.out.println("\nPossible edges: " + possibleEdges);
//        System.out.println("Wanted edges: " + wantedEdges);
//        System.out.println("P: " + p + "\n");

        build(nodes);
    }

    public void build(int nodes) {
        long t = System.currentTimeMillis();
        int i = 0;
        int j = 0;
        Random r = new Random();
        while (wantedEdges > 0) {
            i = r.nextInt(nodes);
            j = r.nextInt(n[i].length);
            if (n[i][j]) continue;
            wantedEdges--;
            n[i][j] = true;
            neighborsCount[i]++;
            neighborsCount[j]++;
        }
        System.out.println("Time to build: " + (System.currentTimeMillis() - t) / 1000);
    }

    public int getNumberOfEdges() {
        int num = 0;
        for (int i=0; i<neighborsCount.length; i++) {
            num += neighborsCount[i];
        }
        return num / 2;
    }
}
