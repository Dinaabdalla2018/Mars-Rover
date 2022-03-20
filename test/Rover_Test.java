/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import mars.rover.Direction;
import mars.rover.Globe;
import mars.rover.Position;
import mars.rover.Rover;

/**
 *
 * @author Leader Shop
 */
public class Rover_Test extends TestCase {
    private Globe globe = new Globe(5, 5);
    private Rover rover = new Rover(globe, new Position(1, 2, Direction.NORTH));
        
    public Rover_Test(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    public void est_Rotate_Right() {
        rover.process('R');
        assertEquals(new Position(1, 2, Direction.EAST), rover.Get_Position());
    }

    public void test_Rotate_Left() {
        rover.process('L');
        assertEquals("1 2 W", rover.Get_Position().toString());
    }

    public void test_Forward() {
        rover.process('F');
        assertEquals("1 3 N", rover.Get_Position().toString());
    }

    public void test_Move() {
        rover.process("RLF");
        assertEquals("1 3 N", rover.Get_Position().toString());
        
        rover = new Rover(globe, new Position(1, 2, Direction.NORTH));
        rover.process("LFLFLFLFF");
        assertEquals("1 3 N", rover.Get_Position().toString());
        
        rover = new Rover(globe, new Position(3, 3, Direction.EAST));
        rover.process("FFRFFRFRRF");
        assertEquals("5 1 E", rover.Get_Position().toString());
        
        rover = new Rover(globe,new Position(4, 5, Direction.WEST));
        rover.process("FB");
        assertEquals(4, rover.Get_Position().get_X());
        
        rover = new Rover(globe,new Position(2, 2, Direction.EAST));
        rover.process("FFRFFRFFR");
        assertEquals(2, rover.Get_Position().get_X());
        
        rover   = new Rover(globe,new Position(3,3,Direction.EAST));
        rover.process("LF");
        assertEquals(4, rover.Get_Position().get_Y());
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
