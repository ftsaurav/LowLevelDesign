import java.util.ArrayList;

interface Prototype<T>{
    T clone();
}
class GamePiece implements Prototype<GamePiece>
{
    String color;
    int position;
    
    public GamePiece(String color, int position) {
        this.color = color;
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public GamePiece clone() {
        return new GamePiece(this.color, this.position);
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }
}
class GameBoard implements Prototype<GameBoard>
{
    private ArrayList<GamePiece> pieces= new ArrayList<>();

    public void addPiece(GamePiece piece){
        pieces.add(piece);
    }

    public ArrayList<GamePiece> getPieces()
    {
        return pieces;
    }
    public void showBoardState()
    {
        for(GamePiece piece: pieces)
        {
            System.out.println(piece);
        }
    }

     @Override
    public GameBoard clone() {
        GameBoard newBoard = new GameBoard();
        for(GamePiece piece:pieces){
            newBoard.addPiece(piece.clone());
        }
        return newBoard;
    }   
}
public class GameBoardMain {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red",1));
        gameBoard.addPiece(new GamePiece("Blue",5));
        gameBoard.showBoardState();

        //Checkpoint this state
        GameBoard copiedBoard = gameBoard.clone();

        System.out.println("Copied Board");
        copiedBoard.showBoardState();
    }
}
