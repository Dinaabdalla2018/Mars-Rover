/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mars.rover;
import java.util.Objects;

/**
 *
 * @author Dina Abdallah
 */
public class Mars_Coordinates {
    
    private final int x;
    private final int y;
    
    private Mars_Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Mars_Coordinates of(int x, int y) {
        return new Mars_Coordinates(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
}


