package com.epam.rd.autotasks.figures;

class Circle extends Figure{
    private double x1,y1, radius;
    public Circle(Point a, double radius) {
        this.x1 = a.getX();
        this.y1 = a.getY();
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String pointsToString() {
        return "("+x1+","+y1+")";
    }

    @Override
    public String toString() {
        return "Circle"+"["+"("+x1+","+y1+")"+radius+"]";

    }

    @Override
    public Point leftmostPoint() {
        return new Point(x1-radius,y1);
    }
}
