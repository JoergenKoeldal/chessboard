import Chesspieces.King;

import java.util.ArrayList;

public class Program {
    Chessboard<Square> chessboard = new Chessboard<>();

    public void runProgram(){
        createSquares();
        System.out.println(chessboard);
    }

    public void createSquares(){



        boolean isWhite;
        int number;
        ArrayList<Square> squares = new ArrayList<>();
        for (int i = 1; i <65 ; i++) {
            if (i % 2 == 0) {
                isWhite = true;
            }else {
                isWhite = false;

            } number = i;
            Square square = new Square(isWhite, number);
            squares.add(square);
        }
        for (Square square: squares) {
            chessboard.addSquare(square);
        }

    }

    public void createChesspieces() {

        boolean isWhite;
        for (int i = 0; i <2 ; i++) {
            if (i % 2 == 0) {
                isWhite = true;
            }else {
                isWhite = false;
            King king = new King("King", isWhite, "Jeg kan gå 1" );
        }
        }

        //Vi overvejer at lave et loop for hver type brik, så vi generere det antal vi skal bruge, så samme princip som kongen


    }
}
