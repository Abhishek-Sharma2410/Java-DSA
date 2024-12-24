import java.util.ArrayList;
import java.util.Stack;
public class CourseScheduleII{
    private static class Edge{
        int source;
        int destination;

        Edge(int source, int destination){
            this.source = source;
            this.destination = destination;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[], int prerequisites[][]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<prerequisites.length; i++){
            int element[] = prerequisites[i];
            graph[element[1]].add(new Edge(element[1], element[0]));
        }
    }
    public static int[] topologicalSort(ArrayList<Edge> graph[]){
        boolean isVisited[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        int result[] = new int[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!isVisited[i]){
                topologicalSortUtil(graph, i, isVisited, s);
            }
        }
        int i = 0;
        while(!s.isEmpty()){
            result[i++] = s.pop();
        }
        return result;
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
    public static int[] findOrder(int numCourses, int prerequisites[][]){
        ArrayList<Edge> graph[] = new ArrayList[numCourses];
        createGraph(graph, prerequisites);
        int topologicalOrder[] = topologicalSort(graph);
        return topologicalOrder;
    }
    public static void main(String args[]){
        int prerequisites[][] = {{1,0}, {2,0}, {3,1}, {3, 2}};
        int arr[] = findOrder(4, prerequisites);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}