import java.util.ArrayList;
import java.util.Stack;
public class topologicalSorting{
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

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static ArrayList<Integer> topologicalSort(ArrayList<Edge> graph[]){
        boolean isVisited[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<graph.length; i++){
            if(!isVisited[i]){
                topologicalSortUtil(graph, i, isVisited, s);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!s.isEmpty()){
            list.add(s.pop());
        }
        return list;
    }
    public static void topologicalSortUtil(ArrayList<Edge> graph[], int current, boolean isVisited[], Stack<Integer> s){
        isVisited[current] = true;
        for(int i=0; i<graph[current].size(); i++){
            Edge e = graph[current].get(i);
            if(!isVisited[e.destination]){
                topologicalSortUtil(graph, e.destination, isVisited, s);
            }
        }
        s.push(current);
    }
    public static void main(String args[]){
        int vertices = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph);
        ArrayList<Integer> list = topologicalSort(graph);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}