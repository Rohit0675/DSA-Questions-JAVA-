package OOPs;

public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        
    }
    
}
//////multiple inheritence
interface Herbivores{

}
interface Carnivores{

}
class Bear implements Herbivores, Carnivores{

}
////////
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, dowm, left, right, diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
