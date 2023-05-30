
package galapagos;

import java.awt.Color;


public class Ch4_number17 {
    
public static void main(String [] args){
    
TurtleDrawingWindow canvas = new TurtleDrawingWindow( );
Turtle winky, pinky, tinky;
//create turtles;
//pass Turtle.NO_DEFAULT_WINDOW as an argument so
//no default drawing window is attached to a turtle.
winky = new Turtle(Turtle.NO_DEFAULT_WINDOW);
pinky = new Turtle(Turtle.NO_DEFAULT_WINDOW);
tinky = new Turtle(Turtle.NO_DEFAULT_WINDOW);

//now add turtles to the drawing window
canvas.add( winky);
canvas.add( pinky);
canvas.add( tinky);

winky.pause( );
pinky.pause( );
tinky.pause( );
//give instructions to turtles here,
//e.g., pinky.move(50); etc.
//now let the turtles start moving
winky.bodyColor(Color.blue);
pinky.bodyColor(Color.RED);
tinky.bodyColor(Color.yellow);

winky.start( );
pinky.start( );
tinky.start( );
}
}