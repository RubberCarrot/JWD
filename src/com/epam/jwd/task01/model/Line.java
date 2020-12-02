package com.epam.jwd.task01.model;

public class Line{
    private Point point1;
    private Point point2;

    private Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point[] getArray(Line line){
        Point[] points = new Point[2];
        points[0] = new Point(line.point1.getAxisX(), line.point1.getAxisY());
        points[1] = new Point(line.point2.getAxisX(), line.point2.getAxisY());
        return points;
    }

    public static Line createLine(Point point1, Point point2){
        return new Line(point1, point2);
    }

    @Override
    public String toString() {
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    public String figureName(){
        return "Line";
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


}
