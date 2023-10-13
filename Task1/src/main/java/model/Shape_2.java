package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape_2 {
    protected double x, y;
    protected Color color;

    abstract double area();

    public Shape_2(double x, double y, Color color){
        System.out.println("Shape constructor called");
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double setX() {
        return this.x;
    }

    public double setY() {
        return this.y;
    }

    public Color setColor()
    {
        return this.color;
    }

    public abstract void draw(GraphicsContext gr);
}