/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import mars.rover.Direction;
import mars.rover.Globe;
import mars.rover.Position;

/**
 *
 * @author Dina2018
 */
public class Grid_Test extends TestCase {
    private Globe globe= new Globe(5, 5);;
    public Grid_Test(String testName) {
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
    
    public void test_Is_Move_Valid() {
        Position position = new Position(1, 2, Direction.NORTH);
        assertTrue(globe.isValidMove(position));
        Position positionQ1 = new Position(1, 6,   Direction.NORTH);
        Position positionQ3 = new Position(-1, -6, Direction.NORTH);
        assertTrue(!globe.isValidMove(positionQ1));
        assertTrue(!globe.isValidMove(positionQ3));
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
