package com.epam.jwd.task01.model;

public class Triangle{
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }



    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point[] getArray(Triangle triangle){
        Point[] points = new Point[3];
        points[0] = new Point(triangle.point1.getAxisX(), triangle.point1.getAxisY());
        points[1] = new Point(triangle.point2.getAxisX(), triangle.point2.getAxisY());
        points[2] = new Point(triangle.point3.getAxisX(), triangle.point3.getAxisY());
        return points;
    }

    public void figurePropertiesStrategy() {

    }
}
