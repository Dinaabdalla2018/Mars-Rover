/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mars.rover;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Dina
 */
public enum Mars_Direction {
    NORTH {
        @Override
        Mars_Coordinates Forward(Mars_Globe globe, Mars_Coordinates mars_coordinates) {
            return Mars_Coordinates.of(mars_coordinates.getX(), (mars_coordinates.getY() + 1));
        }
        @Override
        Mars_Coordinates Backward(Mars_Globe globe, Mars_Coordinates mars_coordinates) {
            return Mars_Coordinates.of(mars_coordinates.getX(), (mars_coordinates.getY()  - 1));
        }
    },  EAST {
        @Override
        Mars_Coordinates Forward(Mars_Globe globe, Mars_Coordinates mars_coordinates) {
            return Mars_Coordinates.of((mars_coordinates.getX() +  1) % globe.getWidth(), mars_coordinates.getY());
        }
        @Override
        Mars_Coordinates Backward(Mars_Globe globe, Mars_Coordinates mars_coordinates) {
            return Mars_Coordinates.of((mars_coordinates.getX() - 1), mars_coordinates.getY());
        }
    
    }, WEST {
        @Override
        Mars_Coordinates Forward(Mars_Globe globe, Mars_Coordinates mars_coordinates) {
            return Mars_Coordinates.of((mars_coordinates.getX() - 1), mars_coordinates.getY());
        }
        Mars_Coordinates Backward(Mars_Globe globe, Mars_Coordinates mars_coordinates) {
            return Mars_Coordinates.of((mars_coordinates.getX() + 1) , mars_coordinates.getY());
        }
    },
    SOUTH {
        @Override
        Mars_Coordinates Forward(Mars_Globe globe, Mars_Coordinates mars_coordinates) {
            return Mars_Coordinates.of(mars_coordinates.getX(), (mars_coordinates.getY()  - 1));
        }  
        @Override
        Mars_Coordinates Backward(Mars_Globe globe, Mars_Coordinates mars_coordinates) {
            return Mars_Coordinates.of(mars_coordinates.getX(), (mars_coordinates.getY() + 1) );
        }    
    };

    private static List<Mars_Direction> TURNING = Arrays.asList(NORTH,EAST, SOUTH, WEST);

    abstract Mars_Coordinates Forward(Mars_Globe globe, Mars_Coordinates mars_coordinates);
    abstract Mars_Coordinates Backward(Mars_Globe globe, Mars_Coordinates mars_coordinates);
    public Mars_Direction turnLeft() {
        return TURNING.get((TURNING.indexOf(this) + 3) % 4);
    }
    public Mars_Direction turnRight() {
        return TURNING.get((TURNING.indexOf(this) + 1) % 4);
    }

    
}


