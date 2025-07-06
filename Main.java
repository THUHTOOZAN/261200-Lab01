// Lab 1.2: Monthly-Themed Drawing
// Golden Lotus representing -
// Month July in Buddhism - Asanha Bucha (also known as Dharma Day)
import java.awt.Color; // color class for custom colors

public class Main {
    public static void main(String[] args) {
        Turtle oreo = new Turtle(); // create new Turtle object named oreo the turtle
        Turtle.bgcolor(new Color(0xFFDB32)); // background color
        oreo.speed(5); // oreo's drawing speed

        oreo.up();
        oreo.home(); // starting center position (0,0)
        oreo.right(90); // turn oreo 90 degrees to the right
        oreo.forward(150); // move oreo 150 pixels forward
        oreo.left(180); // turn the oreo 180 degrees to face the opposite direction
        oreo.down(); // oreo's pen down to start drawing.
        oreo.penColor("forestgreen"); // pen color for the stem
        oreo.width(7); // thickness of the line 7 pixels
        oreo.forward(200); // draw the stem by moving 200 pixels forward

        // OUTER PETALS
        for (int lap = 0; lap < 2; lap++) { // loop that will run 2 times for two layers of outer petals
            for (int i = 0; i < 9; i++) { // inner loop to draw the 9 petals
                oreo.up(); // up the pen to reposition oreo without drawing
                oreo.home(); // move oreo the lil turtle back to the center
                oreo.left(90); // turn oreo 90 degrees to the left, making it face up.
                oreo.forward(50); // move oreo 50 pixels forward to the base of the flower
                oreo.left(40 * i); // rotate oreo to the starting angle for the current petal
                oreo.down(); // pen down to start drawing the petal
                oreo.width(7); // line thickness for the outer petals
                oreo.penColor(new Color(197, 52, 103)); // pen color to pink

                double petalSize = 2.0; // declare and set the default size for the petal forward movement
                if (lap == 1) { // loop to check if this is the second time through the outer loop
                    petalSize = 2.5; // if it is the second layer, increase the size to make it larger
                }

                for (int j = 0; j < 60; j++) { oreo.forward(petalSize); oreo.left(1.5); } // draw the first curved half of the petal
                oreo.left(90); // 90-degree turn at the tip of the petal
                for (int j = 0; j < 60; j++) { oreo.forward(petalSize); oreo.left(1.5); } // draw the second curved half of the petal
            }
        }

        //INNER PETALS
        for (int lap = 0; lap < 2; lap++) { // loop that will run 2 times for two layers of inner petals
            for (int i = 0; i < 9; i++) { // inner loop to draw the 9 petals for the current inner layer
                oreo.up(); // lift the pen to reposition oreo
                oreo.home(); // move oreo back to the center (0,0)
                oreo.left(90); // turn oreo to face up
                oreo.forward(50); // move oreo to the base of the flower
                oreo.left((40 * i) + 20); // rotate to the starting angle, 20 degrees to reach between outer petals
                oreo.down(); // pen down to begin drawing

                double innerPetalSize = 1.5; // declare and set the size for the inner petals
                if (lap == 0) { // check if this is the first layer of inner petals
                    oreo.width(3); // line thickness to 3
                    oreo.penColor(new Color(255, 235, 105)); // pen color to yellow
                } else {
                    innerPetalSize = 1.0; // make final layer of petals smaller
                    oreo.width(2); // line thickness to 2 to make it thinner
                    oreo.penColor(new Color(80, 253, 18)); // pen color to bright green
                }

                for (int j = 0; j < 45; j++) { oreo.forward(innerPetalSize); oreo.left(2); } // the first curved half of the small petal
                oreo.left(90); // Makes a sharp turn at the tip.
                for (int j = 0; j < 45; j++) { oreo.forward(innerPetalSize); oreo.left(2); } // the second curved half of the small petal
            }
        }

        oreo.up(); // lift pen to move to the center
        oreo.home(); // move oreo to the center (0,0)
        oreo.left(90); // turn oreo to face up
        oreo.forward(50); // Move to base of the flower
        oreo.down(); // pen down
        oreo.penColor("yellow"); // pen color to yellow for the center
        oreo.width(15); // line thickness to be very wide
        oreo.forward(1); // move forward one pixel to create thick dot.
    }
}
