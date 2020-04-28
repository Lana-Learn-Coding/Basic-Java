package labnew.lab05.shape;

public class Rectangle extends Shape {
    private double width = 1D;

    private double length = 1D;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

}
