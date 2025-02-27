import java.util.ArrayList;
import java.util.PriorityQueue;
public class PrimsAlgorithm{
    private static class Edge{
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
    }
    private static class Pair implements Comparable<Pair>{
        int vertex;
        int cost;
        
        Pair(int v, int c){
            this.vertex = v;
            this.cost = c;
        }
        
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }
    public static void prims(ArrayList<Edge> graph[]){
        boolean isVisited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0;
        while(!pq.isEmpty()){
            Pair current = pq.remove();
            if(!isVisited[current.vertex]){
                isVisited[current.vertex] = true;
                finalCost += current.cost;
                for(int i=0; i<graph[current.vertex].size(); i++){
                    Edge e = graph[current.vertex].get(i);
                    pq.add(new Pair(e.destination, e.weight));
                }
            }
        }
        System.out.println(finalCost);
    }
    public static void main(String args[]){
        int vertices = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph);
        prims(graph);
    }
}