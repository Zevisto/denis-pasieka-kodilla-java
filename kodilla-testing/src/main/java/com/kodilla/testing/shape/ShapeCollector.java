package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeCollection = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }
    public void removeFigure(Shape shape) {
        shapeCollection.remove(shape);
    }
    public Shape getFigure(int n) {
        return shapeCollection.get(n);
    }
    public void showFigures() {
        System.out.println("Your collection contains.");
        for(int n = 0; n < shapeCollection.size(); n++) {
            Shape temporaryBox = shapeCollection.get(n);
            System.out.println("Element : " + temporaryBox.getShapeName() + " with size : " + temporaryBox.getField() + ".");
        }
    }
}
