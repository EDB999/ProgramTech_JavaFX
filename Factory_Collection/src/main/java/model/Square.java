package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape {

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

    public Square(double x, double y, Color color){
        super(x,y, color);
        this.width = 15;
        this.length = 15;
    }


    @Override
    double area() {
        return width*length;
    }

    @Override
    public String toString () {
        return "Квадрат " + super.setX() + " " + super.setY() + " " + super.getColor().toString();
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(getColor());
        /*gr.strokeRect(super.setX(), super.setY(), this.width, this.length);
         */
        gr.fillRect(super.setX(),super.setY(), this.width, this.length);
    }

}
