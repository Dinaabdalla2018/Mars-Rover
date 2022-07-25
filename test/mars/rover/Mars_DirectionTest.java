/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mars.rover;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dina Abdallah
 */
public class Mars_DirectionTest {
    
    public Mars_DirectionTest() {
    }
    
     @Test
    public void execute_move_forward_to_east() {
        Mars_Coordinates coordinates = Mars_Direction.EAST.Forward(Mars_Globe.of(10, 10), Mars_Coordinates.of(5, 5));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(6, 5));
    }
    @Test
    public void execute_move_backward_to_east() {
        Mars_Coordinates coordinates = Mars_Direction.EAST.Backward(Mars_Globe.of(10, 10), Mars_Coordinates.of(5, 5));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(4, 5));
    }

    @Test
    public void execute_move_forward_to_west() {
        Mars_Coordinates coordinates = Mars_Direction.WEST.Forward(Mars_Globe.of(10, 10), Mars_Coordinates.of(5, 5));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(4, 5));
    }
    @Test
    public void execute_move_backward_to_west() {
        Mars_Coordinates coordinates = Mars_Direction.WEST.Backward(Mars_Globe.of(10, 10), Mars_Coordinates.of(5, 5));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(6, 5));
    }
    
    @Test
    public void execute_move_forward_to_north() {
        Mars_Coordinates coordinates = Mars_Direction.NORTH.Forward(Mars_Globe.of(10, 10), Mars_Coordinates.of(5, 5));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(5, 6));
    }
    
    @Test
    public void execute_move_backward_to_north() {
        Mars_Coordinates coordinates = Mars_Direction.NORTH.Backward(Mars_Globe.of(10, 10), Mars_Coordinates.of(5, 5));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(5, 4));
    }
    
    @Test
    public void execute_move_forward_to_south() {
        Mars_Coordinates coordinates = Mars_Direction.SOUTH.Forward(Mars_Globe.of(10, 10), Mars_Coordinates.of(5, 5));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(5, 4));
    }
    
    @Test
    public void execute_move_backward_to_south() {
        Mars_Coordinates coordinates = Mars_Direction.SOUTH.Backward(Mars_Globe.of(10, 10), Mars_Coordinates.of(5, 5));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(5, 6));
    }
    
    @Test
    public void execute_move_forward_to_east_reaching_edge() {
        Mars_Coordinates coordinates = Mars_Direction.EAST.Forward(Mars_Globe.of(3, 3), Mars_Coordinates.of(2, 1));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(0, 1));
    }
    
    @Test
    public void execute_move_backward_to_east_reaching_edge() {
        Mars_Coordinates coordinates = Mars_Direction.EAST.Backward(Mars_Globe.of(3, 3), Mars_Coordinates.of(2, 1));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(1, 1));
    }

    @Test
    public void execute_move_forward_to_west_reaching_edge() {
        Mars_Coordinates coordinates = Mars_Direction.WEST.Forward(Mars_Globe.of(3, 3), Mars_Coordinates.of(0, 1));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(2, 1));
    }
    
    @Test
    public void execute_move_backward_to_west_reaching_edge() {
        Mars_Coordinates coordinates = Mars_Direction.WEST.Backward(Mars_Globe.of(3, 3), Mars_Coordinates.of(0, 1));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(1, 1));
    }

    @Test
    public void execute_move_forward_to_north_reaching_edge() {
        Mars_Coordinates coordinates = Mars_Direction.NORTH.Forward(Mars_Globe.of(3, 3), Mars_Coordinates.of(2, 2));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(2, 0));
    }
    
    @Test
    public void execute_move_backward_to_north_reaching_edge() {
        Mars_Coordinates coordinates = Mars_Direction.NORTH.Backward(Mars_Globe.of(3, 3), Mars_Coordinates.of(2, 2));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(2, 1));
        
    }
    
    @Test
    public void execute_move_forward_to_south_reaching_edge() {
        Mars_Coordinates coordinates = Mars_Direction.SOUTH.Forward(Mars_Globe.of(3, 3), Mars_Coordinates.of(2, 0));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(2, 2));
    }

    @Test
    public void execute_move_backward_to_south_reaching_edge() {
        Mars_Coordinates coordinates = Mars_Direction.SOUTH.Backward(Mars_Globe.of(3, 3), Mars_Coordinates.of(2, 0));
        assertThat(coordinates).isEqualToComparingFieldByFieldRecursively(Mars_Coordinates.of(2, 1));
    }
    
    @Test
    public void execute_return_EAST_on_turning_right_from_NORTH() {
        assertThat(Mars_Direction.NORTH.turnRight()).isEqualTo(Mars_Direction.EAST);
    }

    @Test
    public void execute_return_SOUTH_on_turning_right_from_EAST() {
        assertThat(Mars_Direction.EAST.turnRight()).isEqualTo(Mars_Direction.SOUTH);
    }

    @Test
    public void execute_return_WEST_on_turning_right_from_SOUTH() {
        assertThat(Mars_Direction.SOUTH.turnRight()).isEqualTo(Mars_Direction.WEST);
    }

    @Test
    public void execute_return_NORTH_on_turning_right_from_WEST() {
        assertThat(Mars_Direction.WEST.turnRight()).isEqualTo(Mars_Direction.NORTH);
    }

    @Test
    public void execute_return_WEST_on_turning_left_from_NORTH() {
        assertThat(Mars_Direction.NORTH.turnLeft()).isEqualTo(Mars_Direction.WEST);
    }

    @Test
    public void execute_return_NORTH_on_turning_left_from_EAST() {
        assertThat(Mars_Direction.EAST.turnLeft()).isEqualTo(Mars_Direction.NORTH);
    }

    @Test
    public void execute_return_EAST_on_turning_left_from_SOUTH() {
        assertThat(Mars_Direction.SOUTH.turnLeft()).isEqualTo(Mars_Direction.EAST);
    }

    @Test
    public void execute_return_SOUTH_on_turning_left_from_WEST() {
        assertThat(Mars_Direction.WEST.turnLeft()).isEqualTo(Mars_Direction.SOUTH);
    }
}
