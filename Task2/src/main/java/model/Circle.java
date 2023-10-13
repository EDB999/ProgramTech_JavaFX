package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape{

    protected double width, length;

    public Circle(double x, double y, Color color, double width, double length) {
        super(x, y, color);
        this.width = width;
        this.length = length;
    }

    public Circle ()
    {
        super(15, 15, Color.RED);
        this.width = 15;
        this.length = 15;
    }
    @Override
    double area() {
        return width;
    }

    @Override
    public String toString () {
        return "Circle color is " + super.getColor().toString() +   "Circle coordinates x,y: " + super.setX() + " " + super.setY() +
                "Width: " + this.width + "Length:" + this.length;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(getColor());
        gr.fillOval(super.setX(),super.setY(), this.width, this.length);
    }
}
