// 5. To create an abstract class named shape that contains two integers and an empty
// method named printArea. Provide three classes named Rectangle, Triangle and Circle
// subclass that each one of the classes extends the Class Shape. Each one of the
// classes contains only the method printArea() that prints the area of Shape.

abstract class shape
{
    int x, y;
    public abstract void printArea();
}

class Rectangle extends shape
{
    public void printArea()
    {
        System.out.println("The are of rectangle: "+x*y);
    }
}

class Circle extends shape
{
    public void printArea()
    {
        System.out.println("The are of circle: "+22*(x*x)/7);
    }
}

class Triangle extends shape
{
    public void printArea()
    {
        System.out.println("The are of rectangle: "+(x*y)/2);
    }
}

public class P5_InheritShape
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Triangle t = new Triangle();
        r.x = 10;
        r.y = 10;
        c.x = 10;
        t.x = 10;
        t.y = 10;
        r.printArea();
        c.printArea();
        t.printArea();
    }
}