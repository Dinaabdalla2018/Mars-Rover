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
public class Mars_Position {
    private final Mars_Coordinates mars_coordinates;
    private final Mars_Direction mars_direction;

    private Mars_Position(Mars_Coordinates mars_coordinates, Mars_Direction mars_direction) {
        this.mars_coordinates = mars_coordinates;
        this.mars_direction = mars_direction;
    }
    
    public static Mars_Position of(Mars_Coordinates mars_coordinates, Mars_Direction mars_direction) {
        return new Mars_Position(mars_coordinates, mars_direction);
    }
    
    public static Mars_Position of(int x, int y, Mars_Direction mars_direction) {
        return new Mars_Position(Mars_Coordinates.of(x, y), mars_direction);
    }
    
    public Mars_Position Forward(Mars_Globe globe) {
        return of(this.mars_direction.Forward(globe, this.mars_coordinates), mars_direction);
    }
    public Mars_Position Backward(Mars_Globe globe) {
        return of(this.mars_direction.Backward(globe, this.mars_coordinates), mars_direction);
    }
    public Mars_Position TurnRight() {
        return of(this.mars_coordinates, this.mars_direction.turnRight());
    }
    public Mars_Position TurnLeft() {
        return of(this.mars_coordinates, this.mars_direction.turnLeft());
    }

}
