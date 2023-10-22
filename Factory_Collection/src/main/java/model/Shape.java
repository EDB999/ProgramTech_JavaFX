package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected double x, y;
    protected Color color;

    abstract double area();

    public Shape(double x, double y, Color color){
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

    public void getX(double x) {
        this.x = x;
    }

    public void getY(double y){
        this.y = y;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public Color getColor(){return this.color;}

    public abstract void draw(GraphicsContext gr);
}

