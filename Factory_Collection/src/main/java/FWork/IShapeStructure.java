package FWork;

import model.Shape;

import java.util.Stack;


public interface IShapeStructure {

    public void clearShape();
    public void appendShape(Shape shape);

    public void setStack(Stack<Shape> stack);

    public Stack<Shape> getStack();
}
