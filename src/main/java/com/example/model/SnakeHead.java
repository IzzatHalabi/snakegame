package com.example.model;

import com.example.dimension.Dimension;
import com.example.position.Position;

public class SnakeHead extends SnakePart {

    private Snake snake;

    public SnakeHead() {
        super();
    }

    public SnakeHead(Position position, Dimension dimension) {
        super(position, dimension);
    }

    @Override
    public void printPosition() {
        System.out.println("HEAD: " + getPrintPosition());
    }

    public Snake getSnake() {
        return snake;
    }
    public void setSnake(Snake snake) {
        this.snake = snake;
    }
    
}
