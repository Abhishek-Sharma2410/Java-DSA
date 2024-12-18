import java.util.PriorityQueue;
public class Knearbycars{
    public static void main(String args[]){
        int points[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        PriorityQueue<point> pq = new PriorityQueue<>();
        for(int i=0; i<points.length; i++){
            int distanceSquare = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            pq.add(new point(points[i][0], points[i][1], i,  distanceSquare));
        }

        for(int i=0; i<k; i++){
            System.out.print("c"+pq.remove().idx+ " ");
        }
        System.out.println();
    }
}

class point implements Comparable<point>{
    int x;
    int y;
    int idx;
    int distanceSquare;

    point(int x, int y, int idx, int distanceSquare){
        this.x = x;
        this.y = y;
        this.idx = idx;
        this.distanceSquare = distanceSquare;
    }

    @Override
    public int compareTo(point p2){
        return this.distanceSquare - p2.distanceSquare;
    }
}

// Read the link of chatgpt - https://chatgpt.com/share/675c125f-2c40-800e-aafb-500f916b6af1