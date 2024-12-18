import java.util.PriorityQueue;
public class Weakestsoldier{
    public static void main(String args[]){
        int matrix[][] = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int k=2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0; i<matrix.length; i++){
            int soldierCount = 0;
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==1){
                    soldierCount++;
                }
            }
            pq.add(new Row(i, soldierCount));
        }
        for(int i=0; i<k; i++){
            System.out.print("Row"+pq.remove().i+ " ");
        }
        System.out.println();
    }
}

class Row implements Comparable<Row>{
    int i;
    int soldierCount;

    Row(int i, int soldierCount){
        this.i = i;
        this.soldierCount = soldierCount;
    }

    @Override
    public int compareTo(Row j){
        if(this.soldierCount == j.soldierCount){
            return this.i - j.i;
        }
        return this.soldierCount - j.soldierCount;
    }
}