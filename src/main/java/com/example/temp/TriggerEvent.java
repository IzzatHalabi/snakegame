package com.example.temp;

import com.example.InGameController;
import com.example.collide.Collidable;
import com.example.model.Apple;
import com.example.model.SnakeHead;
import com.example.model.SnakeTail;

import javafx.event.EventHandler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class TriggerEvent {

    public static EventHandler<KeyEvent> keyReady(GraphicsContext gc) {
        return (KeyEvent event) -> {

            if (!GameObject.isRunning) return;

            if (event.getCode() == KeyCode.UP) {
                executeKeyUp();

            } else if (event.getCode() == KeyCode.DOWN) {
                executeKeyDown();

            } else if (event.getCode() == KeyCode.LEFT) {
                executeKeyLeft();

            } else if (event.getCode() == KeyCode.RIGHT) {
                executeKeyRight();
            }

            reDraw(gc);
        };
    }

    private static void reDraw(GraphicsContext gc) {

        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, InGameController.SCREEN_WIDTH, InGameController.SCREEN_HEIGHT);

        for (Collidable collidable : GameObject.collisionManager.getList()) {

            if (collidable instanceof SnakeHead) {
                gc.setFill(Color.LIGHTGREEN);

            } else if (collidable instanceof SnakeTail) {
                gc.setFill(Color.LIGHTBLUE);

            } else if (collidable instanceof Apple) {
                gc.setFill(Color.RED);
            }

            gc.fillRect(
                collidable.getPosition().getX(), 
                collidable.getPosition().getY(), 
                GameObject.OBJECT_DIMENSION.getWidth(), 
                GameObject.OBJECT_DIMENSION.getHeight());
        }

    }

    private static void executeKeyUp() {
        GameObject.snake.move(GameObject.SNAKE_MOVE_UP);
    }

    private static void executeKeyDown() {
        GameObject.snake.move(GameObject.SNAKE_MOVE_DOWN);
    }

    private static void executeKeyLeft() {
        GameObject.snake.move(GameObject.SNAKE_MOVE_LEFT);
    }

    private static void executeKeyRight() {
        GameObject.snake.move(GameObject.SNAKE_MOVE_RIGHT);
    }
    
}
