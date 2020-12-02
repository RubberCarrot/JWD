package com.epam.jwd.task01.model;

public class Square{
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    private Square(Point point1, Point point2, Point point3, Point point4){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Point[] getArray(Square square){
        Point[] points = new Point[3];
        points[0] = new Point(square.point1.getAxisX(), square.point1.getAxisY());
        points[1] = new Point(square.point2.getAxisX(), square.point2.getAxisY());
        points[2] = new Point(square.point3.getAxisX(), square.point3.getAxisY());
        points[3] = new Point(square.point3.getAxisX(), square.point3.getAxisY());
        return points;
    }

    public static Square createSquare(Point point1, Point point2, Point point3, Point point4){
        return new Square(point1, point2, point3, point4);
    }



    @Override
    public String toString() {
        return "Square{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", point4=" + point4 +
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

    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }



}
