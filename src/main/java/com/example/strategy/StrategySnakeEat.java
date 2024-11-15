package com.example.strategy;

import java.util.List;
import java.util.Random;

import com.example.collide.Collidable;
import com.example.collide.CollisionManager;
import com.example.model.Apple;
import com.example.model.Snake;
import com.example.model.SnakeTail;
import com.example.position.Position;
import com.example.temp.GameObject;

public class StrategySnakeEat {

    public static void execute(CollisionManager collisionManager, List<Collidable> listToAdd, Apple apple, Snake snake) {

        System.out.println(" > STRATEGY: EAT");

        // GROW TAIL
        SnakeTail newTail = snake.growTail();

        newTail.setCollisionManager(collisionManager);
        listToAdd.add(newTail);

        // RESET APPLE
        int randomNumber = new Random().nextInt(15) + 1;
        Position newApplePosition = new Position(randomNumber*GameObject.OBJECT_SCALE, randomNumber*GameObject.OBJECT_SCALE);
        apple.set(newApplePosition);

    }

}
