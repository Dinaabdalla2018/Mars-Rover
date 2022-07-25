/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mars.rover;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author hp
 */
public class Mars_MovesTest {
    
    public Mars_MovesTest() {
    }
    
    @Test
    public void test_Move() {
        MarsRover marsrover = new MarsRover(Mars_Globe.of(5, 5), Mars_Position.of(1, 2, Mars_Direction.NORTH));

        Mars_Position position = marsrover.execute("LFLFLFLFF");
        Mars_Position pos_test = Mars_Position.of(1, 3, Mars_Direction.NORTH);
        assertThat(position).isEqualToComparingFieldByFieldRecursively(pos_test);
    }

    @Test
    public void test_Move2() {
        MarsRover marsrover = new MarsRover(Mars_Globe.of(6, 6), Mars_Position.of(3, 3, Mars_Direction.EAST));

        Mars_Position position = marsrover.execute("FFRFFRFRRF");
        Mars_Position pos_test = Mars_Position.of(5, 1, Mars_Direction.EAST);
        assertThat(position).isEqualToComparingFieldByFieldRecursively(pos_test);
    }
  
    @Test
    public void test_Move3() {
        MarsRover marsrover = new MarsRover(Mars_Globe.of(5, 5), Mars_Position.of(1, 2, Mars_Direction.NORTH));
       
        Mars_Position position = marsrover.execute("FB");
        Mars_Position pos_test = Mars_Position.of(1, 2, Mars_Direction.NORTH);
        assertThat(position).isEqualToComparingFieldByFieldRecursively(pos_test);
    }
    @Test
    public void test_Move4() {
        MarsRover marsrover = new MarsRover(Mars_Globe.of(5, 5), Mars_Position.of(1, 2, Mars_Direction.NORTH));
       
        Mars_Position position = marsrover.execute("FFRFFRFFR");
        Mars_Position pos_test = Mars_Position.of(3, 2, Mars_Direction.WEST);
        assertThat(position).isEqualToComparingFieldByFieldRecursively(pos_test);
    }
       
    @Test
    public void test_Move5() {
        MarsRover marsrover = new MarsRover(Mars_Globe.of(5, 5), Mars_Position.of(1, 2, Mars_Direction.NORTH));
       
        Mars_Position position = marsrover.execute("LF");
        Mars_Position pos_test = Mars_Position.of(0, 2, Mars_Direction.WEST);
        assertThat(position).isEqualToComparingFieldByFieldRecursively(pos_test);
    }
           
}
