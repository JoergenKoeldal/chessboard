public class Square {

    private boolean isWhite;
//    private String letter;
    private int number;


    public Square(boolean isWhite, int number) {
        this.isWhite = isWhite;
//        this.letter = letter;
        this.number = number;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

//    public String getLetter() {
//        return letter;
//    }
//
//    public void setLetter(String letter) {
//        this.letter = letter;
//    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Square{" +
                "isWhite=" + isWhite +
//                ", letter='" + letter + '\'' +
                ", number=" + number +
                '}';
    }
}
