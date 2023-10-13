package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RoundRectangle extends Shape_2 {

    protected double width, length, arc;


    public RoundRectangle(double x, double y, Color color, double width, double length, double arc) {
        super(x, y, color);
        this.width = width;
        this.length = length;
        this.arc = arc;
    }

    @Override
    double area() {
        return width*length;
    }

    @Override
    public String toString () {
        return "Round Rectangle color is " + super.setColor().toString() +   "Rectangle coordinates x,y: " + super.setX() + " " + super.setY() +
                "Width: " + this.width + "Length:" + this.length;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(setColor());
        gr.fillRoundRect(super.setX(),super.setY(), this.width, this.length, this.arc, this.arc);
    }
}
