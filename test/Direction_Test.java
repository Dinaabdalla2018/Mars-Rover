/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import mars.rover.Direction;

/**
 *
 * @author Dina2018
 */
public class Direction_Test extends TestCase {
    
    public Direction_Test(String testName) {
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
    
   
    public void test_rotate_Left(){
        assertEquals(Direction.EAST, Direction.SOUTH.Left());
        assertEquals(Direction.WEST, Direction.NORTH.Left());
    }
    
    public void test_rotate_Riht(){
        assertEquals(Direction.WEST, Direction.SOUTH.Right());
        assertEquals(Direction.EAST, Direction.NORTH.Right());
    }
    
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
