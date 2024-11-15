package com.example.model;

import java.util.List;
import java.util.ArrayList;
import com.example.collide.Collidable;
import com.example.collide.CollisionManager;
import com.example.strategy.StrategySnakeDie;
import com.example.strategy.StrategySnakeEat;

public class GameCollisionManager implements CollisionManager {

    private ArrayList<Collidable> list;
    private ArrayList<Collidable> listToAdd;

    public GameCollisionManager(List<Collidable> list) {

        this.list = new ArrayList<>(list);

        for (Collidable collidable : this.list) {
            collidable.setCollisionManager(this);
        }

    }

    @Override
    public void onPositionChanged(Collidable movingCollidable) {

        this.listToAdd = new ArrayList<>();

        for (Collidable collidable : this.list) {
            if (collidable != movingCollidable && isColliding(movingCollidable, collidable)) {
                handleCollision(collidable, movingCollidable);
            }
        }

        this.list.addAll(this.listToAdd);
        this.listToAdd.clear();
    }

    @Override
    public void handleCollision(Collidable collidable, Collidable movingCollidable) {

        if (! (movingCollidable instanceof SnakeHead)) return;

        if (collidable instanceof SnakeTail) {
            StrategySnakeDie.execute();
        
        } else if (collidable instanceof Apple) {
            Snake snake = ((SnakeHead) movingCollidable).getSnake();
            Apple apple = ((Apple) collidable);
            StrategySnakeEat.execute(this, this.listToAdd, apple, snake);
        }
        
    }

    @Override
    public List<Collidable> getList() {
        return list;
    }
    
}
