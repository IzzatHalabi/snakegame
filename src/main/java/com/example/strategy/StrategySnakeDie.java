package com.example.strategy;

import com.example.temp.GameObject;

public class StrategySnakeDie {
    
    public static void execute() {
        System.out.println(" > STRATEGY: DIE");
        System.out.println(" > GAME OVER!");

        GameObject.isRunning = false;
    }

}
