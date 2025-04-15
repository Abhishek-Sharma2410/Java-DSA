import java.util.ArrayList;
import java.util.Collections;
public class KruskalsAlgo{
    private static class Edge implements Comparable<Edge>{
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge e2){
            return this.weight - e2.weight;
        }
    }
    public static void createGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));

        edges.add(new Edge(1, 0, 10));
        edges.add(new Edge(1, 3, 40));

        edges.add(new Edge(2, 0, 15));
        edges.add(new Edge(2, 3, 50));
    }
    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for(int i=0; i<par.length; i++){
            par[i] = i;
        }
    }
    public static int find(int n){
        if(n==par[n]){
            return n;
        }
        return par[n] = find(par[n]);
    }
    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(parA != parB){
            if(rank[parA] == rank[parB]){
                par[parA] = parB;
                rank[parB]++;
            }
            else if(rank[parA]<rank[parB]){
                par[parA] = parB;
            }
            else{
                par[parB] = parA;
            }
        }
    }
    public static int kruskals(ArrayList<Edge> edges, int V){
        init();
        Collections.sort(edges);
        int finalCost = 0;
        for(int i=0; i<edges.size(); i++){
            Edge e = edges.get(i);
            int parA = find(e.source);
            int parB = find(e.destination);

            if(parA!=parB){
                union(e.source, e.destination);
                finalCost += e.weight;
            }
        }
        return finalCost;
    }
    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> edges = new ArrayList();
        createGraph(edges);
        System.out.println(kruskals(edges, V));
    }
}