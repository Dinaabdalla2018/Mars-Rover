/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mars.rover;

/**
 *
 * @author Dina2018
 */
public class Globe{
    private int x; 
    private int y;

   

    public Globe(int x ,int y ){
        this.x =x ;
        this.y =y ;
    }

    public boolean isValidMove(Position position){
        return position.ValidMove(x,y);
    }
}
