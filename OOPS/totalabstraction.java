public class totalabstraction{
    public static void main(String args[]){
        Pawn p1 = new Pawn();
        p1.moves();
        Queen q1 = new Queen();
        q1.moves();
    }
}

interface chessPlayer{
    void moves();
}

class Pawn implements chessPlayer{
    public void moves(){
        System.out.println("Pawn can move one unit in any direction !");
    }
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Queen can move unlimited ups downs left right diagonals");
    }
}