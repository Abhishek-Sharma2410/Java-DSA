import java.util.ArrayList;
public class cycleDetectionDirected{
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

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }
    public static boolean cycleDetection(ArrayList<Edge> graph[]){
        boolean isVisited[] = new boolean[graph.length];
        boolean pathVisited[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!isVisited[i]){
                if(cycleDetectionUtil(graph, i, isVisited, pathVisited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean cycleDetectionUtil(ArrayList<Edge> graph[], int current, boolean isVisited[], boolean pathVisited[]){
        isVisited[current] = true;
        pathVisited[current] = true;

        for(int i=0; i<graph[current].size(); i++){
            Edge e = graph[current].get(i);
            if(!isVisited[e.destination]){
                if(cycleDetectionUtil(graph, e.destination,  isVisited, pathVisited))
                return true;
            }
            else if(isVisited[e.destination] && pathVisited[e.destination]){
                return true;
            }
        }
        pathVisited[current] = false;
        return false;
    }
    public static void main(String args[]){
        int vertices = 4;
        ArrayList<Edge> directedGraph[] = new ArrayList[vertices];
        createGraph(directedGraph);
        System.out.println(cycleDetection(directedGraph));
    }
}