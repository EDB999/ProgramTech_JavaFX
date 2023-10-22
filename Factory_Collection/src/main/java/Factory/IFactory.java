package Factory;

import model.Shape;

public interface IFactory {
    Shape CreateShape(String figure);
}

