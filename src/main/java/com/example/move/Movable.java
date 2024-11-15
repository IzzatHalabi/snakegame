package com.example.move;

import com.example.position.Position;
import com.example.position.Positionable;

public interface Movable extends Positionable {
    
    static final int X = 1;
    static final int Y = 2;

    default void move(Position position) {
        move(X, position.getX());
        move(Y, position.getY());
    }

    default void move(int direction, int value) {
        Position position = getPosition();
        if (direction == X) position.setX(position.getX() + value);
        else if (direction == Y) position.setY(position.getY() + value);
    }
    
}
