package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    ShapeCollector shapeCollector = new ShapeCollector();
    Square square = new Square();
    Triangle triangle = new Triangle();
    Circle circle = new Circle();

    @Test
    public void addFigure() {
        System.out.println("Testing .addFigure.");
        Assert.assertTrue(shapeCollector.getFigure(0) == square);
    }
    @Test
    public void removeFigure() {
        System.out.println("Testing .removeFigure.");
        shapeCollector.removeFigure(triangle);
        Assert.assertTrue(shapeCollector.getFigure(1) != triangle);
    }
    @Test
    public void getFigure() {
        System.out.println("Testing .getFigure.");
        Assert.assertTrue(shapeCollector.getFigure(0) == square);
    }
    @Test
    public void showFigures() {
        System.out.println("Testing .showFigures : ");
        shapeCollector.showFigures();
    }
    @Before
    public void before() {
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        System.out.println("Starting test: ");
    }
    @After
    public void after() {
        System.out.println("Test finished. \n");
    }
}
