package com.rudrava;

class ShapeUtil2d{
    //    area
    static int getArea(int l, int b){ return l * b; };
    static double getArea(double r){ return 3.14 * r * r; };
    static int getArea(int s){ return s * s; };

    //   perimeter
    static int getPrimeter(int l, int b){ return 2*( l + b); };
    static double getPrimeter(double r){ return 2 * 3.14 * r; };
    static int getPrimeter(int s){ return 4 * s; }
};

interface util3d {
    double PI = 3.14;
    public int getArea(int s);
    public double getArea(double r);
    public double getArea(double r, double h);
}

class ShapeUtil3d implements util3d {
    public int getArea(int s) {
        return 6 * s * s;
    }
    public double getArea(double r) {
        return 4 * PI * r *r;
    }
    public double getArea(double r, double h) {
        return 2 * PI * r * (h + r);
    }
}
public class Assingment2 {
    public static void main(String[] args) {
//        3d
        ShapeUtil3d shape = new ShapeUtil3d();
        System.out.println("surfacearea of cube " + shape.getArea(4));
        System.out.println("surfacearea of Sphere " + shape.getArea(4));
        System.out.println("surfacearea of Cylinder " + shape.getArea(4, 5));

//        2d
//        area
        System.out.println("area of cube " + ShapeUtil2d.getArea(4));
        System.out.println("area of Sphere " + ShapeUtil2d.getArea(4.0));
        System.out.println("area of Cylinder " + ShapeUtil2d.getArea(4, 5));
//        perimeter
        System.out.println("area of cube " + ShapeUtil2d.getPrimeter(4));
        System.out.println("area of Sphere " + ShapeUtil2d.getPrimeter(4.0));
        System.out.println("area of Cylinder " + ShapeUtil2d.getPrimeter(4, 5));
    }
}

