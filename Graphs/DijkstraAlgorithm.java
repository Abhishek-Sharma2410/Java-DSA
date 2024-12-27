import java.util.ArrayList;
import java.util.PriorityQueue;
public class DijkstraAlgorithm{
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
        
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));
        
        graph[2].add(new Edge(2, 4, 3));
        
        graph[3].add(new Edge(3, 5, 1));
        
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    private static class Pair implements Comparable<Pair>{
        int element;
        int distance;
        
        Pair(int element, int distance){
            this.element = element;
            this.distance = distance;
        }
        
        @Override
        public int compareTo(Pair p2){
            return this.distance - p2.distance;
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[], int src){
        int shortestPath[] = new int[graph.length];
        for(int i=0; i<shortestPath.length; i++){
            if(i!=src){
                shortestPath[i] = Integer.MAX_VALUE;
            }
        }
        boolean isVisited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        
        while(!pq.isEmpty()){
            Pair current = pq.remove();
            if(!isVisited[current.element]){
                isVisited[current.element] = true;
                for(int i=0; i<graph[current.element].size(); i++){
                    Edge e = graph[current.element].get(i);
                    int u = e.source;
                    int v = e.destination;
                    int weight = e.weight;
                    
                    if(shortestPath[u] + weight < shortestPath[v]){
                        shortestPath[v] = shortestPath[u] + weight;
                        pq.add(new Pair(v, shortestPath[v]));   
                    }
                }
            }
        }
        for(int i=0; i<shortestPath.length; i++){
            System.out.print(shortestPath[i] + " ");
        }
    }
    public static void main(String args[]){
        int vertices = 6;
        int source = 0;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph);
        dijkstra(graph, source);
    }
}