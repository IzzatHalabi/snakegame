package com.example.position;

public class Position {

    private int x = 0;
    private int y = 0;

    public Position() {}

    public Position(Positionable positionable) {
        set(positionable);
    }
    
    public Position(Position position) {
        set(position);
    }

    public Position(int x, int y) {
        set(x, y);
    }

    public void set(Positionable positionable) {
        Position position = positionable.getPosition();
        set(position.x, position.y);
    }

    public void set(Position position) {
        set(position.x, position.y);
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getPrint() {
        return "Position (x=" + this.x + "; y=" + this.y + ")";
    }

    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }

}
