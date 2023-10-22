package FWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Stack;

public interface IControlFile<T>
{
    Stack<T> openFileMemory(File file);

    void saveFileMemory(Stack<T> stack) throws FileNotFoundException;
}
