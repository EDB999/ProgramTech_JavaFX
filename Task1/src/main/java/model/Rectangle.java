package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape_2 {

    private double width, length;

    public Rectangle(double x, double y, Color color, double width, double length) {
        super(x, y, color);
        this.width = width;
        this.length = length;
    }


    @Override
    double area() {
        return width*length;
    }

    @Override
    public String toString () {
        return "Rectangle color is " + super.setColor().toString() +   "Rectangle coordinates x,y: " + super.setX() + " " + super.setY() +
                "Width: " + this.width + "Length:" + this.length;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(setColor());
        gr.fillRect(super.setX(),super.setY(), this.width, this.length);
    }

}
