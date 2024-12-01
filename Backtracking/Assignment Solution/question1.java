public class question1{
    public static int ratOutOfMaze(int maze[][], int i, int j, int left, int right, int top, int bottom){
        if(i==maze.length-1 || j==maze[0].length-1) return 1;
        //Right
        if(isSafeRight(maze, i, j)){
            right++;
        }
        if(isSafeLeft(maze, i, j)){
            right++;
        }
        if(isSafeTop(maze, i, j)){
            right++;
        }
        if(isSafeBottom(maze, i, j)){
            right++;
        }
        ratOutOfMaze(maze, i, j+1, left, right, top, bottom);
        ratOutOfMaze(maze, i, j-1, left, right, top, bottom);
        ratOutOfMaze(maze, i-1, j, left, right, top, bottom);
        ratOutOfMaze(maze, i+1, j, left, right, top, bottom);
        return left+right+top+bottom;
    }
    public static boolean isSafeRight(int maze[][], int row, int col){
        if(maze[row][col+1]==0) return false;
        return true;
    }
    public static boolean isSafeLeft(int maze[][], int row, int col){
        if(col==0) return false;
        if(maze[row][col-1]==0) return false;
        return true;
    }
    public static boolean isSafeTop(int maze[][], int row, int col){
        if(row==0) return false;
        if(maze[row-1][col]==0) return false;
        return true;
    }
    public static boolean isSafeBottom(int maze[][], int row, int col){
        if(row==maze.length) return false;
        if(maze[row+1][col]==0) return false;
        return true;
    }
    public static void main(String args[]){
        int right=0, left=0, top=0, bottom=0;
        int maze[][] = {{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        System.out.println(ratOutOfMaze(maze, 0, 0, left, right, top, bottom));
    }
}