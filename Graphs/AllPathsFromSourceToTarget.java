import java.util.ArrayList;
public class AllPathsFromSourceToTarget{
    private static class Edge{
        int source;
        int destination;

        Edge(int source, int destination){
            this.source = source;
            this.destination = destination;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void allPossiblePath(ArrayList<Edge> graph[], int src, int target, ArrayList<Integer> path, boolean isVisited[]){
        path.add(src);
        if(src==target) printPath(path);
        else{
            isVisited[src] = true;
            for(int i=0; i<graph[src].size(); i++){
                Edge e = graph[src].get(i);
                if(!isVisited[e.destination]){
                    allPossiblePath(graph, e.destination, target, path, isVisited);
                }
            }
            isVisited[src] = false;
        }    
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int vertices = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        ArrayList<Integer> path = new ArrayList<>();
        boolean isVisited[] = new boolean[graph.length];
        createGraph(graph);
        allPossiblePath(graph, 1, 3, path, isVisited);
    }
}