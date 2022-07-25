# MARS ROVER PROBLEM
# Problem Description
You are part of the team that explores Mars by sending remotely controlled vehicles to the surface of the planet. 
Develop an API that translates the commands sent from earth to instructions that are understood by the rover.
When the rover touches down on Mars, it is initialised with it’s current coordinates and the direction
it is facing. These could be any coordinates, supplied as arguments (x, y, direction) e.g. (4,2, EAST).

# Description
The rover is given a command string which contains multiple commands. This string must then be
broken into each individual command and that command then executed. The valid commands are:
* F -> Move forward on current heading
* B -> Move backwards on current heading
* L -> Rotate left by 90 degrees
* R -> Rotate right by 90 degrees <br />


INPUT:
The first line of input is the coordinates for grid example [5,5].<br />
The rest of the input is the rovers's position.<br />
The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's direction.<br />

OUTPUT<br />
The output for each rover should be its final co-ordinates and direction.<br />

Test Input:<br />
```
 5 5
 1 2 N
 LFLFLFLFF
```
Expected Output:<br />
```
1 3 N
```

> Mars_Direction: Contain moves in 4 (WEST,EAST,NORTH,SOUTH)<br />
> mars_coordinates: coordinates mars in world
Mars_Position: what is board and coordinates <br />
Mars_Globe: weights and height world <br />
Mars_Rover: Rover's move sequence <br />
Mars_Moves: Rover's move (forword, backword, Left, Right) <br />

# Testing
2 file is test moves and direction<br/>
**library**</br>
junit 4.12 </br>
assertj-core 3.5.2

> using NetBeans After install library can test files:Mars_Direction_test, Mars_Moves_test
