/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mars.rover;

import java.util.Objects;

/**
 *
 * @author Dina2018
 */
public class Position {
    private int x;
    private int y;
    private Direction direction;
    
    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    public Direction get_direction(){
        return direction;
    }
    public int get_X(){
        return x;
    }
    public int get_Y(){
        return y;
    }
    public void Move_Forword() {
        switch (this.direction.toString()) {
            case "N":
                this.y = y+1;
                break;
            case "E":
                this.x = x+1;
                break;
            case "W":
                this.x = x-1;
                break;
            case "S":
                this.y = y-1;
                break;
            default:
                throw new IllegalStateException("Incorrect Direction");
        }
    }
    public void Move_Backward() {
        switch(this.direction.toString()) {
            case "N":
                this.y += 1;
                break;
            case "S":
                this.y -= 1;
                break;
            case "E":
                this.x -= 1;
                break;
            case "W":
                this.x += 1;
                break;
            default:
                System.out.println("Incorrect Direction");
        }
    }
    public void Rotate_R() {
        this.direction = direction.Right();
    }

    public void Rotate_L() {
        this.direction =  direction.Left();
    }

    public boolean isValidPosition(int x, int y) {
        return this.x <= x && this.y <= y;
    }

    public boolean isOutPosition(int x, int y) {
        return this.x >= x && this.y >= y;
    }
    
    public boolean ValidMove(int x,int y){
        return isValidPosition(x,y) && isOutPosition(0,0);
    }
    
    @Override
    public String toString() {
        return x + " " + y + " " + direction;
    }
    
}
