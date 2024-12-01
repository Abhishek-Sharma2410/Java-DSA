public class shortestdistance{
    public static float shortestPath(String moves){
        int x=0, y=0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i)=='N'){
                y++;
            }
            else if(moves.charAt(i)=='S'){
                y--;
            }
            else if(moves.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        float shotestDistance = (float)(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
        return shotestDistance;
    }
    public static void main(String args[]){
        String moves = new String("WNEENESENNN");
        System.out.println(shortestPath(moves));
    }
}