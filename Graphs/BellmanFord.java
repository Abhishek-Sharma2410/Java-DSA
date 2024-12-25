import java.util.ArrayList;
public class BellmanFord{
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

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }
    public static void bellmanFord(ArrayList<Edge> graph[], int src){
        int shortestPath[] = new int[graph.length];
        for(int i=0; i<shortestPath.length; i++){
            if(i!=src)
            shortestPath[i] = Integer.MAX_VALUE;
        }

        int V = graph.length;
        for(int i=0; i<V-1; i++){
            for(int j=0; j<graph.length; j++){
                for(int k=0; k<graph[j].size(); k++){
                    Edge e = graph[j].get(k);
                    int u = e.source;
                    int v = e.destination;
                    int weight = e.weight;

                    if(shortestPath[u]!=Integer.MAX_VALUE && shortestPath[u] + weight < shortestPath[v]){
                        shortestPath[v] = shortestPath[u] + weight;
                    }
                }
            }
        }

        for(int i=0; i<shortestPath.length; i++){
            System.out.print(shortestPath[i] + " ");
        }
    }
    public static void main(String args[]){
        int vertices = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph);
        bellmanFord(graph, 0);
    }
}