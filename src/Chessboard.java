import java.lang.reflect.Array;
import java.util.ArrayList;

public class Chessboard <T>{

    private final ArrayList<Square> squares = new ArrayList<>();


    public void addSquare(Square square){
        squares.add(square);
    }

    @Override
    public String toString() {
        return "Chessboard{" +
                "squares=" + squares +
                '}';
    }
}
