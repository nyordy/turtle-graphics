package edu.macalester.cs124;
import edu.macalester.generator.FibonacciGenerator;
import edu.macalester.generator.PrimeGenerator;
import edu.macalester.generator.SteppingGenerator;
import java.util.Random;

import java.awt.Color;

import edu.macalester.turtle.Turtle;
import edu.macalester.turtle.TurtleProgram;

public class Spiral extends TurtleProgram {
    public void run() {
    	spiral(Color.BLUE, 90);
        setTurtleSpeedFactor(100);
        
        println("Done!");
    }
        
        
    public void spiral(Color spiralColor, double angle) {
    	Turtle turtle = new Turtle(getWidth() / 2, getHeight() / 2);
    
        add(turtle);
        turtle.setColor(spiralColor);
        turtle.setStepSize(1);
        Random rand = new Random();
        int whichgenerator = rand.nextInt(2);
        
        if(whichgenerator == 0) {
        	FibonacciGenerator fib = new FibonacciGenerator();
        while(turtleIsNearScreen(turtle)) {
            turtle.forward(fib.next());
            turtle.left(angle);
        }
        }
        else if(whichgenerator == 1) {
        	PrimeGenerator prime = new PrimeGenerator(2);
        while(turtleIsNearScreen(turtle)) {
            turtle.forward(prime.next());
            turtle.left(angle);
        }
        }
        else if(whichgenerator == 2) {
        	SteppingGenerator stp = new SteppingGenerator(2,5);
        while(turtleIsNearScreen(turtle)) {
            turtle.forward(stp.next());
            turtle.left(angle);
        }
        } else
		System.exit(whichgenerator);
        }

 

    private boolean turtleIsNearScreen(Turtle turtle) {
        double margin = Math.max(getWidth(), getHeight()) / 2;
        return turtle.getX() > -margin
            && turtle.getY() > -margin
            && turtle.getX() < getWidth()  + margin
            && turtle.getY() < getHeight() + margin;
    }
}
