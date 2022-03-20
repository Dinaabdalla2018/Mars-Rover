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
public class Rover {
    private Position Position;
    private Globe    globe;
    private String   Command="";

    public Rover(Globe globe, Position Position) {
        this.globe    = globe;
        this.Position = Position;
    }

    public Position Get_Position() {
        return Position;
    }
    
    public Direction Get_Direction() {
        return this.Position.get_direction();
    }
    public void process(String instructions) {
        instructions.chars().mapToObj(c -> (char) c).forEach(this::process);
    }

    public void process(Character instruction) {
        switch (instruction) {
            case 'R':
                Rotate_Right();
                break;

            case 'L':
                Rotate_Left();
                break;

            case 'F':
                move_head();
                break;
            
            case 'B':
                move_back();
                break;    

        }
    }

    public void move_head() {
        Position Pos = this.Position;
        Pos.Move_Forword();
        if (globe.isValidMove(Pos)){
            this.Position= Pos;
            Command+="Forword " ;
            return;
        }
        Command+="Stopped " ;
    }
    public void move_back() {
        Position Pos = this.Position;
        Pos.Move_Backward();
        if (globe.isValidMove(Pos)){
            this.Position = Pos;
            Command+="Back " ;
            return;
        }
        Command+="Stopped " ;
    }

    public void Rotate_Right() {
        this.Position.Rotate_R();
        Command+="Right " ;
    }

    public void Rotate_Left() {
        this.Position.Rotate_L();
        Command+="Left " ;
    }
    
   
    public String toString() {
        return this.Position.toString();
    }
    
    public String Seq_move(){
        return Command;
    }
}
