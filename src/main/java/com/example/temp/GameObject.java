package com.example.temp;

import java.util.Arrays;
import java.util.List;

import com.example.collide.Collidable;
import com.example.dimension.Dimension;
import com.example.model.Apple;
import com.example.model.GameCollisionManager;
import com.example.model.Snake;
import com.example.model.SnakeHead;
import com.example.model.SnakeTail;
import com.example.position.Position;

public class GameObject {

    public static final int OBJECT_SCALE = 30;

    public static final Position SNAKE_MOVE_UP = new Position(0, -OBJECT_SCALE);
    public static final Position SNAKE_MOVE_DOWN = new Position(0, OBJECT_SCALE);
    public static final Position SNAKE_MOVE_RIGHT = new Position(OBJECT_SCALE, 0);
    public static final Position SNAKE_MOVE_LEFT = new Position(-OBJECT_SCALE, 0);

    public static final Dimension OBJECT_DIMENSION = new Dimension(OBJECT_SCALE, OBJECT_SCALE);

    public static Snake snake = null;
    public static Apple apple = null;
    public static GameCollisionManager collisionManager = null;

    public static boolean isRunning = false;

    public static void init() {

        SnakeHead head = new SnakeHead(new Position(1*OBJECT_SCALE, 1*OBJECT_SCALE), OBJECT_DIMENSION);
        SnakeTail tail = new SnakeTail(new Position(1*OBJECT_SCALE, 1*OBJECT_SCALE), OBJECT_DIMENSION);
        SnakeTail tail2 = new SnakeTail(new Position(1*OBJECT_SCALE, 1*OBJECT_SCALE), OBJECT_DIMENSION);
        SnakeTail tail3 = new SnakeTail(new Position(1*OBJECT_SCALE, 1*OBJECT_SCALE), OBJECT_DIMENSION);
        SnakeTail tail4 = new SnakeTail(new Position(1*OBJECT_SCALE, 1*OBJECT_SCALE), OBJECT_DIMENSION);
        SnakeTail tail5 = new SnakeTail(new Position(1*OBJECT_SCALE, 1*OBJECT_SCALE), OBJECT_DIMENSION);
        SnakeTail tail6 = new SnakeTail(new Position(1*OBJECT_SCALE, 1*OBJECT_SCALE), OBJECT_DIMENSION);
        SnakeTail tail7 = new SnakeTail(new Position(1*OBJECT_SCALE, 1*OBJECT_SCALE), OBJECT_DIMENSION);
        snake = new Snake(head, tail, tail2, tail3, tail4, tail5, tail6, tail7);

        apple = new Apple(new Position(4*OBJECT_SCALE, 1*OBJECT_SCALE), OBJECT_DIMENSION);

        List<Collidable> collidableList = Arrays.asList(head, tail, tail2, tail3, tail4, tail5, tail6, tail7, apple);
        collisionManager = new GameCollisionManager(collidableList);

        isRunning = true;

    }
    
}
