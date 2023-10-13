package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape{

    private double width, length;

    public Square(double x, double y, Color color, double width, double length) {
        super(x, y, color);
        this.width = width;
        this.length = length;
    }

    public Square() {
        super(15,15, Color.GREEN);
        this.length = 15;
        this.width = 15;
    }


    @Override
    double area() {
        return width*length;
    }

    @Override
    public String toString () {
        return "Square color is " + super.getColor().toString() +   "Square coordinates x,y: " + super.setX() + " " + super.setY() +
                "Width: " + this.width + "Length:" + this.length;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(getColor());
        /*gr.strokeRect(super.setX(), super.setY(), this.width, this.length);
         */
        gr.fillRect(super.setX(),super.setY(), this.width, this.length);
    }

}
