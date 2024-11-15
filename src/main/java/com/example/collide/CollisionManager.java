package com.example.collide;

import java.util.List;

import com.example.dimension.Dimension;
import com.example.position.Position;

public interface CollisionManager {

    List<Collidable> getList();

    default void onPositionChanged(Collidable movingCollidable) {
        for (Collidable collidable : getList()) {
            if (collidable != movingCollidable && isColliding(movingCollidable, collidable)) {
                handleCollision(collidable, movingCollidable);
            }
        }
    }

    default boolean isColliding(Collidable movingCollidable, Collidable otherCollidable) {
        Position mcPosition = movingCollidable.getPosition();
        int mcX = mcPosition.getX();
        int mcY = mcPosition.getY();

        Dimension mcDimension = movingCollidable.getDimension();
        int mcWidth = mcDimension.getWidth();
        int mcHeight = mcDimension.getHeight();

        Position ocPosition = otherCollidable.getPosition();
        int ocX = ocPosition.getX();
        int ocY = ocPosition.getY();

        Dimension ocDimension = otherCollidable.getDimension();
        int ocWidth = ocDimension.getWidth();
        int ocHeight = ocDimension.getHeight();

        boolean overlapX = mcX < ocX + ocWidth && mcX + mcWidth > ocX;
        boolean overlapY = mcY < ocY + ocHeight && mcY + mcHeight > ocY;

        return overlapX && overlapY;
    }

    default void handleCollision(Collidable collidable, Collidable movingCollidable) {
        System.out.println("DETECTING COLLISION");
    }
    
}
