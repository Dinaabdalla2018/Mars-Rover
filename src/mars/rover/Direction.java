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
public enum Direction {
    
    NORTH("N") {
        // NE
        @Override
        public Direction Right(){
            return EAST;
        }
        
        // NW
        @Override
        public Direction Left(){
            return WEST;
        }
        
    },
    EAST("E") {
          //NE
        @Override
        public Direction Left(){
            return NORTH;
        }
        
        //SE
        @Override
        public Direction Right(){
            return SOUTH;
        }
        
    },
    WEST("W") {
        //NW
        @Override
        public Direction Right(){
            return NORTH;
        }
        //SW
        @Override
        public Direction Left(){
            return SOUTH;
        }

    },

    SOUTH("S") {
        //SE
        @Override
        public Direction Left(){
            return EAST;
        }
        //SW
        @Override
        public Direction Right(){
            return WEST;
        }
    };

    private String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public abstract Direction Right();
    public abstract Direction Left();

    public static Direction get(String Dir) {
        switch (Dir) {
             case "N":
                return NORTH;
            case "E":
                return EAST;
            case "W":
                return WEST;
            case "S":
                return SOUTH;
            default:
                throw new IllegalStateException("Incorrect Direction");
        }
    }

    @Override
    public String toString() {
        return direction;
    }
}
