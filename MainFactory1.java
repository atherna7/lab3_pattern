/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainfactory1;

/**
 *
 * @author basha
 */
public class MainFactory1 {
    public static void main(String[] args) {
        // Demonstrate the Factory Design Pattern

        // Create factories for different shapes
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();
        ShapeFactory triangleFactory = new TriangleFactory();

        // Use the factories to create shapes
        Shape circle = circleFactory.createShape();
        Shape rectangle = rectangleFactory.createShape();
        Shape triangle = triangleFactory.createShape();

        // Draw the shapes
        System.out.println("Drawing the Shapes:");
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
