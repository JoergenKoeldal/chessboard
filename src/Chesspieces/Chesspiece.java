package Chesspieces;

abstract class Chesspiece {

    private String name;
    private boolean isWhite;
    private String movement;

    public Chesspiece(String name, boolean isWhite, String movement) {
        this.name = name;
        this.isWhite = isWhite;
        this.movement = movement;
    }

    public String getName() {
        return name;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public String getMovement() {
        return movement;
    }
}
