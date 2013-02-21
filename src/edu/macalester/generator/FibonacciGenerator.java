package edu.macalester.generator;


public class FibonacciGenerator {
    private int cur;
    int a = 1;
    int b = 0;
    
    public int next() {
       int output = b + a;
       a = b;
       b = output;
       return output;
       
    }
    

}
