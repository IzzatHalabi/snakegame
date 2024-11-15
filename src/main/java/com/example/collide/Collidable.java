package com.example.collide;

import com.example.dimension.Dimensionable;
import com.example.move.Movable;
import com.example.position.Position;

public interface Collidable extends Movable, Dimensionable {

    void setCollisionManager(CollisionManager collisionManager);

    CollisionManager getCollisionManager();

    @Override
    default void move(Position position) {
        Movable.super.move(position);
        getCollisionManager().onPositionChanged(this);
    }

}
