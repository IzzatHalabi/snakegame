package com.example.dimension;

public interface Dimensionable {

    Dimension getDimension();

    default void setDimension(Dimension dimension) {
        getDimension().set(dimension);
    }

    default String getPrintDimension() {
        return getDimension().getPrint();
    }

    default void printDimension() {
        System.out.println(getPrintDimension());
    }
    
}
