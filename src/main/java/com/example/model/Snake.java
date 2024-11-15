package com.example.model;

import java.util.List;

import com.example.position.Position;
import com.example.temp.GameObject;

import java.util.ArrayList;

public class Snake {

    private SnakeHead head;
    private List<SnakeTail> tailList;

    public Snake() {}

    public Snake(SnakeHead head, SnakeTail... tails) {
        this.head = head;
        this.tailList = new ArrayList<>(List.of(tails));

        this.head.setSnake(this);
    }

    public void move(Position position) {

        System.out.println(" MOVE");

        Position oldPosition = new Position(this.head);

        this.head.move(position);

        for (SnakeTail tail : tailList) {

            Position tempPosition = new Position(tail);
            
            tail.set(oldPosition);
            
            oldPosition = tempPosition;
        }

    }

    public SnakeTail growTail() {

        SnakePart referencePart = this.tailList.get(this.tailList.size() - 1);

        SnakeTail newTail = new SnakeTail(referencePart.getPosition(), GameObject.OBJECT_DIMENSION);
        
        this.tailList.add(newTail);

        return newTail;
    }

    public void print() {
        System.out.println(" > SNAKE INFORMATION ");
        System.out.println("TAIL SIZE: " + this.tailList.size());
    }

    public List<SnakeTail> getTailList() {
        return tailList;
    }
    public void setTailList(List<SnakeTail> partList) {
        this.tailList = partList;
    }
    public SnakeHead getHead() {
        return head;
    }
    public void setHead(SnakeHead head) {
        this.head = head;
    }
    
}
