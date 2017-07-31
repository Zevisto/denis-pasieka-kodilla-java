package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    ArrayList<Shape> shapeCollection = new ArrayList<Shape>();
    ShapeCollector shapeCollector = new ShapeCollector();
    Square square = new Square();
    Triangle triangle = new Triangle();
    Circle circle = new Circle();

    @Test
    public void addFigure() {
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        Assert.assertTrue(shapeCollection.size() == 3);
    }
    @Test
    public void removeFigure() {
        shapeCollector.removeFigure(triangle);
        Assert.assertTrue(shapeCollection.get(1) == square && shapeCollection.get(2) == null);
    }
    @Test
    public void getFigure() {
        Shape figure = shapeCollector.getFigure(1);
        Assert.assertTrue(figure == square);
    }
    @Test
    public void showFigures() {
        shapeCollector.showFigures();
    }
}
