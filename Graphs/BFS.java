import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BFS{
    private static class Edge{
        int source;
        int destination;

        Edge(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    private static void buildGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void BFS(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean isVisited[] = new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()){
            int element = q.remove();
            if(!isVisited[element]){
                System.out.print(element + " ");
                isVisited[element] = true;
                for(int i=0; i<graph[element].size(); i++){
                    q.add(graph[element].get(i).destination);
                }
            }
        }
    }
    public static void main(String args[]){
        int vertices = 7;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        buildGraph(graph);
        BFS(graph);
    }
}