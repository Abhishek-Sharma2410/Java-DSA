import java.util.ArrayList;
import java.util.PriorityQueue;
public class ConnectCitiesWithMinimumCost{
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
    public static void createGraph(ArrayList<Edge> graph[], int cities[][]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i=0; i<cities.length; i++){
            for(int j=0; j<cities[i].length; j++){
                if(cities[i][j]!=0){
                    graph[i].add(new Edge(i, j, cities[i][j]));
                }
            }
        }
    }
    private static class Pair implements Comparable<Pair>{
        int vertex;
        int cost;
        
        Pair(int vertex, int cost){
            this.vertex = vertex;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }
    public static int prims(ArrayList<Edge> graph[]){
        boolean isVisited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0;
        while(!pq.isEmpty()){
            Pair current = pq.remove();
            
            if(!isVisited[current.vertex]){
                finalCost += current.cost;
                isVisited[current.vertex] = true;
                for(int i=0; i<graph[current.vertex].size(); i++){
                    Edge e = graph[current.vertex].get(i);
                    if(!isVisited[e.destination])
                    pq.add(new Pair(e.destination, e.weight));
                }
            }
        }
        return finalCost;
    }
    public static void main(String args[]){
        int cities[][] = {{0, 1, 2, 3, 4}, {1, 0, 5, 0, 7}, {2, 5, 0, 6, 0}, {3, 0, 6, 0, 0}, {4, 7, 0, 0, 0}};
        ArrayList<Edge> graph[] = new ArrayList[cities.length];
        createGraph(graph, cities);
        System.out.println(prims(graph));
    }
}