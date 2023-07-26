// 5. To create an abstract class named shape that contains two integers and an empty
// method named printArea. Provide three classes named Rectangle, Triangle and Circle
// subclass that each one of the classes extends the Class Shape. Each one of the
// classes contains only the method printArea() that prints the area of Shape.
abstract class shape
{
    public int i, j;
    public abstract void printArea();
}

class Rectangle extends shape
{
    public void printArea()
    {
        System.out.println("Area of Rectangle: "+i*j);
    }
}

class Circle extends shape
{
    public void printArea()
    {
        System.out.println("Area of Circle: "+(i*i)*22/7);
    }
}

class Triangle extends shape
{
    public void printArea()
    {
        System.out.println("Area of Triangle: "+(i*j)/2);
    }
}

public class P5_InheritShape {
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.i = 10;
        r.j = 11;
        Circle c = new Circle();
        c.i = 10; 
        Triangle t = new Triangle();
        t.i = 10;
        t.j = 11;

        r.printArea();
        c.printArea();
        t.printArea();

    }
}
