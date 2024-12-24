import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class IsBipartite{
    private static class Edge{
        int source;
        int destination;

        Edge(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }
    public static boolean isBipartite(ArrayList<Edge> graph[]){
        int coloring[] = new int[graph.length];
        for(int i=0; i<coloring.length; i++){
            coloring[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(coloring[i]==-1){
                q.add(i);
                coloring[i] = 0;

                while(!q.isEmpty()){
                    int element = q.remove();
                    for(int j=0; j<graph[element].size(); j++){
                        Edge e = graph[element].get(j);
                        if(coloring[e.destination] == -1){
                            int toBeColored = (coloring[element]==0) ? 1 : 0;
                            coloring[e.destination] = toBeColored;
                            q.add(e.destination);
                        }
                        else if(coloring[e.destination]==coloring[element]){
                            return false;
                        }
                    }
                }
            }

        }

        return true;
    }
    public static void main(String args[]){
        int vertices = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}