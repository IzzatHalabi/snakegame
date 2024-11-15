package com.example.model;

import com.example.dimension.Dimension;
import com.example.position.Position;

public class SnakeTail extends SnakePart {

    public SnakeTail() {
        super();
    }

    public SnakeTail(Position position, Dimension dimension) {
        super(position, dimension);
    }

    @Override
    public void printPosition() {
        System.out.println("TAIL: " + getPrintPosition());
    }
    
}
