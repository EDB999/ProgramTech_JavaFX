package Factory;

import model.Square;
import model.Circle;
import model.Shape;
import model.Triangle;

public class FactoryShape implements IFactory{

    @Override
    public Shape CreateShape(String figure)
    {
        if (figure.equals("0-круг"))
        {
            return new Circle();
        } else if (figure.equals("3-треугольник"))
        {
            return new Triangle();
        } else if (figure.equals("4-квадрат"))
        {
            return new Square();
        } return null;
    }
}
