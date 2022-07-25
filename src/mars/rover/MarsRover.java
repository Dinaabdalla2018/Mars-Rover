/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mars.rover;

/**
 *
 * @author Dina Abdallah
 */
public class MarsRover {
    
    private Mars_Position roverPosition;
    private final Mars_Globe globe;

    public MarsRover(Mars_Globe globe, Mars_Position roverPosition) {
        this.globe = globe;
        this.roverPosition = roverPosition;
    }

    private void apply_move(Mars_Moves mars_moves) {
        roverPosition = mars_moves.move(this.globe, this.roverPosition);
    }
    
     public Mars_Position execute(String Move_command) {
        Move_command.chars().mapToObj(c -> (char) c).map(Mars_Moves::fromCode).forEach(this::apply_move);
        return roverPosition;
    }

}
