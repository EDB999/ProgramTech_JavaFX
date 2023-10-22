package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {

    protected int side;

    public Triangle(double x, double y, Color color, int i) {
        super(x, y, color);
    }

    public Triangle()
    {
        super(15, 15, Color.YELLOW);
    }

    public Triangle(double x, double y, Color color){
        super(x,y,color);
        this.side = 15;
    }
    @Override
    double area() {
        return 0;
    }

    @Override
    public String toString () {
        return "Треугольник " + super.setX() + " " + super.setY() + " " + super.getColor().toString();
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(getColor());
        gr.fillPolygon(new double[]{super.setX(),setX() + 10, setX() -20},new double[]{super.setY() + 10,setY(), setY() - 20},3);
    }
}
