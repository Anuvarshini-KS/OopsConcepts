package com.KovanLabs.Intern.InheritanceAndPolymorphism;
import java.util.*;
public class ShapeFactory {
    public static void main(String[]args)
    {
        Shape[] shapes = {
                new Circle(5),
                new Square(4),
                new Circle(8),
                new Square(7)
        };
        double totalArea = 0.0;
        for(Shape s : shapes)
        {
            double area = s.area();
            System.out.println("Area : "+area);
            totalArea+=area;
        }
        System.out.println("Total Area : "+totalArea);
    }
}
abstract class Shape
{
    abstract double area();
}
class Circle extends Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    double area()
    {
        return Math.PI*radius*radius;
    }
}
class Square extends Shape
{
    double radius;
    Square(double radius)
    {
        this.radius=radius;
    }
    double area()
    {
        return radius*radius;
    }
}
