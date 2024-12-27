import java.util.ArrayList;
import java.util.PriorityQueue;
public class anycode{
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
        int distance;
        
        Pair(int vertex, int distance){
            this.vertex = vertex;
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
        pq.add(new Pair(0, 0));
        
        while(!pq.isEmpty()){
            Pair current = pq.remove();
            
            if(!isVisited[current.vertex]){
                isVisited[current.vertex] = true;
                for(int i=0; i<graph[current.vertex].size(); i++){
                    Edge e = graph[current.vertex].get(i);
                    int u = e.source;
                    int v = e.destination;
                    int wt = e.weight;
                    
                    if(shortestPath[u] + wt < shortestPath[v]){
                        shortestPath[v] = shortestPath[u] + wt;
                        pq.add(new Pair(v, shortestPath[v]));
                    }
                }
            }
        }
        
        for(int i=0; i<shortestPath.length; i++){
            System.out.print(shortestPath[i] + " ");
        }
        System.out.println();
    }
    public static void bellmanFord(ArrayList<Edge> graph[], int src){
        int distance[] = new int[graph.length];
        for(int i=0; i<distance.length; i++){
            if(i!=src)
            distance[i] = Integer.MAX_VALUE;
        }
        int V = graph.length;
        for(int i=0; i<V-1; i++){
            for(int j=0; j<graph.length; i++){
                for(int k=0; k<graph[i].size(); k++){
                    Edge e = graph[j].get(k);
                    int u = e.source;
                    int v = e.destination;
                    int wt = e.weight;
                    
                    if(distance[u]!=Integer.MAX_VALUE && distance[u] + wt < distance[v]){
                        distance[v] = distance[u] + wt;
                    }
                }
            }
        }
        for(int i=0; i<distance.length; i++){
            System.out.print(distance[i] + " ");
        }
        System.out.println();
    }
    private static class Pair2 implements Comparable<Pair2>{
        int vertex;
        int cost;
        
        Pair2(int vertex, int cost){
            this.vertex = vertex;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Pair2 p2){
            return this.cost - p2.cost;
        }
    }
    public static int prims(ArrayList<Edge> graph[]){
        boolean isVisited[] = new boolean[graph.length];
        PriorityQueue<Pair2> pq = new PriorityQueue<>();
        pq.add(new Pair2(0, 0));
        int finalCost = 0;
        while(!pq.isEmpty()){
            Pair2 current= pq.remove();
            if(!isVisited[current.vertex]){
                isVisited[current.vertex] = true;
                finalCost += current.cost;
                for(int i=0; i<graph[current.vertex].size(); i++){
                    Edge e = graph[current.vertex].get(i);
                    pq.add(new Pair2(e.destination, e.weight));
                }
            }
        }
        return finalCost;
    }
    public static void main(String args[]){
        int vertices = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph);
        System.out.println(prims(graph));
    }
}