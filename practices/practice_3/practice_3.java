
import static java.lang.Math.PI;

abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){};
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    };

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;
    Rectangle(double width,double length){
        this.length = length;
        this.width = width;
    };
    Rectangle(double width,double length,String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    };

    public void setLength(double length) {
        this.length = length;
    };

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea(){
        return width*length;
    };
    @Override
    public double getPerimeter(){
        return 2*width+2*length;
    };

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}

class Square extends Rectangle{
    Square(double side){
        super(side,side);
    }
    Square(double side,String color, boolean filled){
        super(side,side,color, filled);
    }
    public double getSide(){
        return width;
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + width +
                '}';
    }
}


class Circle extends Shape {
    protected double radius;
    Circle(double radius){
        this.radius = radius;
    };
    Circle(double radius,String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    };

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea(){
        return PI*radius*radius;
    };
    @Override
    public double getPerimeter(){
        return 2*PI*radius;
    };

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(14, "green",true);
        Square square = new Square(13,"yellow", false);
        System.out.println(circle);
        System.out.println(square);
    }
}
