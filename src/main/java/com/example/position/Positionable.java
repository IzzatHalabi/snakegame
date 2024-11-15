package com.example.position;

public interface Positionable {
    
    Position getPosition();

    default void set(Position position) {
        getPosition().set(position);
    }

    default String getPrintPosition() {
        return getPosition().getPrint();
    }

    default void printPosition() {
        System.out.println(getPrintPosition());
    }
    
}
