package com.epam.rd.autotasks.figures;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Triangle extends Figure {
    private double x1, x2, x3, y1, y2, y3;

    public Triangle(Point a,Point b, Point c) {
        this.x1 = a.getX();
        this.y1 = a.getY();
        this.x2 = b.getX();
        this.y2 = b.getY();
        this.x3 = c.getX();
        this.y3 = c.getY();
    }

    @Override
    public double area() {
       double A = sqrt(pow((x2-x1),2 ) + pow((y2-y1),2));
       double B = sqrt(pow((x3-x2),2 ) + pow((y3-y2),2));
       double C = sqrt(pow((x1-x3),2 ) + pow((y1-y3),2));
        double S = (A+B+C)/2;
        double T = sqrt((S*(S-A)*(S-B)*(S-C)));
        return T;
    }

    @Override
    public String toString() {
        return "Triangle"+"["+"("+x1+","+y1+")"+"("+x2+","+y2+")"+"("+x3+","+y3+")"+"]";


    }

    @Override
    public String pointsToString() {
        return "("+x1+","+y1+")"+"("+x2+","+y2+")"+"("+x3+","+y3+")";
    }

    @Override
    public Point leftmostPoint() {
        if (x1 <= x2 && x1 <= x3) return new Point(x1, y1); else {
            if (x2<=x1 && x2<=x3) return new Point(x2, y2); else {
                if (x3<=x2 && x3<=x1) return new Point(x3, y3);
            }
        }
        return new Point(x1,y1);}
}
