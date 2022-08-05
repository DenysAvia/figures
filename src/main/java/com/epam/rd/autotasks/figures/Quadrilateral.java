package com.epam.rd.autotasks.figures;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Quadrilateral extends Figure{
    private double x1, x2, x3, y1, y2, y3, x4,y4;
    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.x1 = a.getX();
        this.y1 = a.getY();
        this.x2 = b.getX();
        this.y2 = b.getY();
        this.x3 = c.getX();
        this.y3 = c.getY();
        this.x4 = d.getX();
        this.y4 = d.getY();
    }

    @Override
    public double area() {

        double AB = sqrt(pow((x2-x1),2 ) + pow((y2-y1),2));
        double BC = sqrt(pow((x3-x2),2 ) + pow((y3-y2),2));
        double CA = sqrt(pow((x1-x3),2 ) + pow((y1-y3),2));
        double S1 = (AB+BC+CA)/2;
        double T1 = sqrt((S1*(S1-AB)*(S1-BC)*(S1-CA)));

        double AC = sqrt(pow((x3-x1),2 ) + pow((y3-y1),2));
        double CD = sqrt(pow((x4-x3),2 ) + pow((y4-y3),2));
        double DA = sqrt(pow((x1-x4),2 ) + pow((y1-y4),2));
        double S2 = (AC+CD+DA)/2;
        double T2 = sqrt((S2*(S2-AC)*(S2-CD)*(S2-DA)));

        return T1+T2;
    }

    @Override
    public String pointsToString() {
        return "("+x1+","+y1+")"+"("+x2+","+y2+")"+"("+x3+","+y3+")"+"("+x4+","+y4+")";

    }

    @Override
    public String toString() {
        return "Quadrilateral"+"["+"("+x1+","+y1+")"+"("+x2+","+y2+")"+"("+x3+","+y3+")"+"("+x4+","+y4+")"+"]";
    }

    @Override
    public Point leftmostPoint() {
        if (x1 <= x2 && x1 <= x3 && x1<=x4) return new Point(x1, y1); else {
            if (x2<=x1 && x2<=x3 && x1<=x4) return new Point(x2, y2); else {
                if (x3<=x2 && x3<=x1 && x3<=x4) return new Point(x3, y3); else {
                    if (x4<=x1 && x4<=x2 && x4<=x3) return new Point(x4, y4);
                }
            }
        }
        return new Point(x1,y1);}
}
