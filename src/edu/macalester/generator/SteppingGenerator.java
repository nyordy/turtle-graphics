package edu.macalester.generator;


public class SteppingGenerator {
    private double cur;
    private double step;
    
    public SteppingGenerator(double start, double inputstep) {
    	cur = start;
    	step = inputstep;
    }
    public double next() { 
    	  cur = cur + step;
    	  return cur;
       }
       
    

}
