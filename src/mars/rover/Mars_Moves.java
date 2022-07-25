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
public enum Mars_Moves {
    MoveForword('F'){
        @Override
        public Mars_Position move(Mars_Globe globe, Mars_Position roverPosition) {
            return roverPosition.Forward(globe);
        }
    },
    MoveBackword('B') {
        @Override
        public Mars_Position move(Mars_Globe globe, Mars_Position roverPosition) {
            return roverPosition.Backward(globe);
        }
    },
    LEFT('L') {
        @Override
        public Mars_Position move(Mars_Globe globe, Mars_Position roverPosition) {
            return roverPosition.TurnLeft();
        }
    },
    RIGHT('R') {
        @Override
        public Mars_Position move(Mars_Globe globe, Mars_Position roverPosition) {
            return roverPosition.TurnRight();
        }
    };
    
    public abstract Mars_Position move(Mars_Globe globe, Mars_Position roverPosition);
    
    private char M;
    Mars_Moves(char M){
        this.M=M;
    }
    
    public static Mars_Moves fromCode(char M) {
        for (Mars_Moves mars_move : Mars_Moves.values()) {
            if (mars_move.M == M) {
                return mars_move;
            }
        }
        throw new IllegalArgumentException("unknown Mars Move " + M +" Please enter correct move");
    }

}

   

