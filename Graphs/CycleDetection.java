import java.util.ArrayList;
public class CycleDetection{
    private static class Edge{
        int source;
        int destination;

        Edge(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static void buildGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        graph[1].add(new Edge(1, 3));
        graph[3].add(new Edge(3, 1));
    }
    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean isVisited[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!isVisited[i]){
                if(detectCycleUtil(graph, i, -1, isVisited))
                return true;
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge> graph[], int current, int parent, boolean isVisited[]){
        isVisited[current] = true;
        for(int i=0; i<graph[current].size(); i++){
            Edge e = graph[current].get(i);
            if(!isVisited[e.destination]){
                if(detectCycleUtil(graph, e.destination, current, isVisited))
                return true;
            }
            else if(isVisited[e.destination] && e.destination != parent){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int vertices = 7;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        boolean isVisited[] = new boolean[graph.length];
        buildGraph(graph);
        System.out.println(detectCycle(graph));
    }
}