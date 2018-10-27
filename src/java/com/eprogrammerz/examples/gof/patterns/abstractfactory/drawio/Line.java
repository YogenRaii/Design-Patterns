package com.eprogrammerz.examples.gof.patterns.abstractfactory.drawio;

/**
 * Concrete Product
 */
public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line Drawn.");
    }
}
