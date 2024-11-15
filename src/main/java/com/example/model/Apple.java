package com.example.model;

import com.example.collide.Collidable;
import com.example.collide.CollisionManager;
import com.example.dimension.Dimension;
import com.example.position.Position;

public class Apple implements Collidable {

    private Position position;
    private Dimension dimension;

    private CollisionManager collisionManager;
    
    public Apple() {
        this.position = new Position();
        this.dimension = new Dimension();
    }

    public Apple(Position position, Dimension dimension) {
        this.position = new Position(position);
        this.dimension = new Dimension(dimension);
    }

    @Override
    public void printPosition() {
        System.out.println("APPLE: " + getPrintPosition());
    }

    @Override
    public Position getPosition() {
        return this.position;
    }
    @Override
    public Dimension getDimension() {
        return this.dimension;
    }
    @Override
    public void setCollisionManager(CollisionManager collisionManager) {
        this.collisionManager = collisionManager;
    }
    @Override
    public CollisionManager getCollisionManager() {
        return this.collisionManager;
    }
    
}
