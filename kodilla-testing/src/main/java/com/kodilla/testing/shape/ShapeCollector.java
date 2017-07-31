package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public void addFigure(Shape shape) {
        ArrayList<Shape> result = new ArrayList<Shape>();
        result.add(shape);
    }
    public void removeFigure(Shape shape) {
        ArrayList<Shape> result = new ArrayList<Shape>();
        result.remove(shape);
    }
    public Shape getFigure(int n) {
        ArrayList<Shape> result = new ArrayList<Shape>();
        return result.get(n);
    }
    public void showFigures() {
        ArrayList<Shape> result = new ArrayList<Shape>();
        for(int n = 0; n < result.size(); n++) {
            System.out.println(result.get(n));
        }
    }
}
