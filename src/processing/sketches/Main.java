package processing.sketches;

import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        size(500, 600);
    }

    public void setup() {
        // Sets the color mode to HSB, 360 being the max Hue,
        // 100 the max Saturation, and 100 the max Brightness
        colorMode(HSB, 360, 100, 100);
    }

    public void draw() {
        // Recreates the background to be black each 'draw'
        background(0, 0, 0);

        // Look at the code in this method for some sample uses of rect and ellipse
        drawSamples();

        // Create a branch to allow you to work on the new feature of rectangles
        drawRectangles();

        // Create a branch to allow you to work on the new feature of ellipses
        drawEllipses();

    }

    public void drawSamples() {
        // Fill changes the color to shade in the following drawn shapes
        fill(300.0f, 80.0f, 85.0f);
        // Rect draws a rect with the given parameters
        rect(100, 100, 400, 400);

        fill(100.0f, 100.0f, 100.0f);
        // Ellipse draws an ellipse with the given parameters
        ellipse(300, 150, 200, 100);
    }

    /**
     * Draw a few rectangles, each with different colors at different parts of the screen.
     */
    public void drawRectangles() {
        fill(20f, 100, 100);
        rect(0,0,width, height);

        fill(200,100,100);
        rect(20,20,width-40, height-40);

        fill(100,50,50);
        rect(40,40,width-80, height-80);
    }

    /**
     * Draw a few ellipses, each with different colors at different parts of the screen.
     */
    public void drawEllipses() {
        fill(50,50,100);
        ellipse(40,40,30,30);

        fill(50,50,100);
        ellipse(width-40, 40,30,30);

        fill(50,50,100);
        ellipse(40, height/2,30,30);

        fill(50,50,100);
        ellipse(width-40, height/2,30,30);

        fill(50,50,100);
        ellipse(40, height-40,30,30);

        fill(50,50,100);
        ellipse(width-40, height-40,30,30);
    }

    public static void main(String[] args) {
        PApplet.main("processing.sketches.Main");
    }
}
