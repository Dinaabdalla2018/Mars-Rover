/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import mars.rover.Direction;
import mars.rover.Position;

/**
 *
 * @author Dina2018
 */
public class Position_Test extends TestCase {
    private Position positionNorth ;
    private Position positionEast;
    private Position position;
    public Position_Test(String testName) {
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
    
    public void test_TurnRight(){
        positionNorth = new Position(0,0, Direction.NORTH);
        positionEast  = new Position(0,0, Direction.EAST);
        positionNorth.Rotate_R();
        positionEast.Rotate_R();
        assertEquals(new Position(0,0, Direction.EAST) , positionNorth);
        assertEquals(new Position(0,0, Direction.SOUTH), positionEast);
    }

    
    public void test_TurnLeft() {
        positionNorth = new Position(0,0, Direction.NORTH);
        positionEast  = new Position(0,0, Direction.EAST);
        positionNorth.Rotate_L();
        positionEast.Rotate_L();
        assertEquals(new Position(0,0, Direction.WEST),  positionNorth);
        assertEquals(new Position(0,0, Direction.NORTH), positionEast);
    }

    public void test_Forward() {
        positionNorth = new Position(0,0, Direction.NORTH);
        positionEast  = new Position(0,0, Direction.EAST);
        positionNorth.Move_Forword();
        positionEast.Move_Forword();
        assertEquals(new Position(0,1, Direction.NORTH), positionNorth);
        assertEquals(new Position(1,0, Direction.EAST), positionEast);
    }
    
    public void test_PositionIsInside() {
        position = new Position(1, 2, Direction.NORTH);
        assertTrue(position.isValidPosition(5, 5));
        position = new Position(6, 2, Direction.NORTH);
        assertTrue(!position.isValidPosition(5, 5));
    }
    
    public void test_PositionIsOutside() {
        position = new Position(1, 2, Direction.NORTH);
        assertTrue(position.isOutPosition(0, 0));
        position = new Position(-1, 2, Direction.NORTH);
        assertTrue(!position.isOutPosition(0, 0));
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
