# MARS ROVER PROBLEM
# Problem Description
You are part of the team that explores Mars by sending remotely controlled vehicles to the surface of the planet. 
Develop an API that translates the commands sent from earth to instructions that are understood by the rover.
When the rover touches down on Mars, it is initialised with it’s current coordinates and the direction
it is facing. These could be any coordinates, supplied as arguments (x, y, direction) e.g. (4,2, EAST).

The rover is given a command string which contains multiple commands. This string must then be
broken into each individual command and that command then executed. The valid commands are:
* F -> Move forward on current heading
* B -> Move backwards on current heading
* L -> Rotate left by 90 degrees
* R -> Rotate right by 90 degrees

- Direction : Contain 4 (WEST,EAST,NORTH,SOUTH)
- Postion   : Contain what is the postion when move Forward&Backward , Rotate Left,Right
- Globe     : Rover move in the specific space
- Rover     : Process of moving Rover

INPUT:
The first line of input is the coordinates for grid example [5,5].

The rest of the input is the rovers's position.

The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's direction.

OUTPUT
The output for each rover should be its final co-ordinates and direction.

Test Input:
5 5
1 2 N
LFLFLFLFF

Expected Output:
1 3 N

# Testing
test each file in folder test using junit 3.7 
